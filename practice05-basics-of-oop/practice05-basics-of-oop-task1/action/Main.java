package by.jonline.practice05.oop.task1.action;

import java.io.IOException;

//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.

public class Main {

    public static void main(String[] args)  {

        Action act = new Action();
        try {
            act.userAction();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
