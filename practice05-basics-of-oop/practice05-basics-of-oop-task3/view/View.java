package by.jonline.practice05.oop.task3.view;

import java.util.Scanner;

import by.jonline.practice05.oop.task3.calendar.Calendar;
import by.jonline.practice05.oop.task3.calendar.DayOfWeek;
import by.jonline.practice05.oop.task3.calendar.Calendar.Month.Day;

//Создать класс Календарь с внутренним классом, с помощью объектов которого
//можно хранить информацию о выходных и праздничных днях.

public class View {

    public View() {
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public Integer enterInt(String massage) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Integer value;
        System.out.println(massage);

        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Input correct date>>");
        }
        value = sc.nextInt();

        return value;
    }

    public void showDayInfo(Day day) {
        try {
            System.out.println(day.getNumber() + "." + day.getMonth() + "." + day.getYear() + " - " + day.getDayOfWeek()
                    + ", day off - " + day.isDayOff() + ", holiday - " + day.isHoliday() + ". " + day.getReminder());
            System.out.println();
        } catch (NullPointerException eNull) {
            System.out.println("!Date entry error, NullPointerException");
        }

    }

    public void showCalendar(Calendar calendar_2020) {
        System.out.println("Calendar 2020 year");
        calendar_2020.getYear_2020().forEach((numberMonth, month) -> {
            System.out.println(numberMonth + ":  ");
            for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
                if (dayOfWeek != month.getMonth_2020().get(1).getDayOfWeek()) {
                    System.out.print(" ");
                    System.out.printf("%2.2s", dayOfWeek);
                    System.out.printf("%2.2s", "  ");
                } else {
                    break;
                }
            }
            month.getMonth_2020().forEach((numberDay, day) -> {
                System.out.printf("%2.2s", numberDay.toString());
                System.out.printf("%2.2s", day.getDayOfWeek().toString());
                System.out.print(" ");
            });
            System.out.println();
        });
    }
}
