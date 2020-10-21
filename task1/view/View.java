package by.jonline.practice05.oop.task1.view;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import by.jonline.practice05.oop.task1.file.TextFile;
import by.jonline.practice05.oop.task1.logic.Logic;

//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.

public class View {

    private Logic logic;

    public View() {
    }

    public String enterString(String massage) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String request;
        System.out.println(massage);

        while (!sc.hasNextLine()) {
            sc.next();
            System.out.println(massage);
        }
        request = sc.nextLine();
        return request;
    }

    public void show(TextFile textFile) throws IOException {
        if (logic == null) {
            logic = new Logic();
        }
        for (String s : logic.readText(textFile)) {
            System.out.println(s);
        }
    }

    public void show(String str) {
        System.out.println(str);
    }

    public void show(List<String> lines) {
        for (String s : lines) {
            System.out.println(s);
        }
    }
}
