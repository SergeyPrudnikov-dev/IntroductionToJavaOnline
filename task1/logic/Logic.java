package by.jonline.practice05.oop.task1.logic;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

import by.jonline.practice05.oop.task1.file.Directory;
import by.jonline.practice05.oop.task1.file.TextFile;

//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.

public class Logic {

    public Logic() {
    }

    public TextFile createTextFile(String pathString, String fileName) throws IOException {
        Directory directory;
        TextFile textFile;
        directory = null;
        textFile = null;

        directory = new Directory(pathString);
        textFile = new TextFile(directory, fileName);
        return textFile;
    }

    public void addText(TextFile textFile, String newText) throws IOException {
        List<String> lines = Arrays.asList(newText);
        Files.write(textFile.getFile(), lines, StandardOpenOption.APPEND);
    }

    public List<String> readText(TextFile textFile) throws IOException {
        Path path;
        path = Paths.get(textFile.getFile().toAbsolutePath().toString());
        List<String> lines;
        lines = null;
        lines = Files.readAllLines(path, Charset.forName("UTF-8"));
        return lines;
    }

    public void deleteFile(TextFile textFile) throws IOException {
        Files.delete(textFile.getFile());
    }

    public TextFile renameTextFile(TextFile textFile1, String newName) throws IOException {

        TextFile newTextFile;
        newTextFile = null;
        newTextFile = new TextFile(textFile1.getDirectory(), newName);

        List<String> lines = readText(textFile1);
        for (String s : lines) {
            addText(newTextFile, s);
        }
        deleteFile(textFile1);
        return newTextFile;
    }

}
