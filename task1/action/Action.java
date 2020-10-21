package by.jonline.practice05.oop.task1.action;

import java.io.IOException;

import by.jonline.practice05.oop.task1.file.TextFile;
import by.jonline.practice05.oop.task1.logic.Logic;
import by.jonline.practice05.oop.task1.view.View;

//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.

public class Action {

    public Action() {
    }

    private Logic logic = new Logic();
    private View view = new View();
    private TextFile textFile;

    public void userAction() throws IOException {

        String pathString;
        String fileName;
        String newName;
        String newText;

        pathString = view.enterString("Enter path >> ");
        fileName = view.enterString("Input file name >> ");
        textFile = logic.createTextFile(pathString, fileName);

        newText = view.enterString("Enter a text >> ");
        logic.addText(textFile, newText);

        newText = view.enterString("Enter a text >> ");
        logic.addText(textFile, newText);
        view.show(textFile);

        newName = view.enterString("Enter a new file name >> ");
        if (!textFile.getFileName().equals(newName)) {
        textFile = logic.renameTextFile(textFile, newName);
        view.show(textFile);
        } else {
            view.show("You entered the old file name. ");
        }
    }
}
