package by.jonline.practice05.oop.task4.view;

import java.util.Scanner;

//Создать класс Календарь с внутренним классом, с помощью объектов которого
//можно хранить информацию о выходных и праздничных днях.

public class ConsoleInput {

    public ConsoleInput() {
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
        sc.nextLine();

        return request;
    }

    public int enterInt(String massage) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int number = -1;
        while (number < 0) { // защита от ввода отрицательных значений

            System.out.println(massage);
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println(massage);
            }

            number = sc.nextInt();
        }
        return number;
    }
}
