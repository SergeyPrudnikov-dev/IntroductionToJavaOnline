package by.jonline.practice05.oop.task3.main;

import by.jonline.practice05.oop.task3.calendar.Calendar;
import by.jonline.practice05.oop.task3.calendar.Calendar.Month.Day;
import by.jonline.practice05.oop.task3.logic.Logic;
import by.jonline.practice05.oop.task3.view.View;

// Создать класс Календарь с внутренним классом, с помощью объектов которого
// можно хранить информацию о выходных и праздничных днях.

public class Main {

    public static void main(String[] args) {

        Logic logic = new Logic();
        View view = new View();
        Calendar calendar_2020;
        calendar_2020 = logic.createCalendar_2020();
        Day day;

        day = logic.enterDate(calendar_2020);
        view.showDayInfo(day);
        view.showMessage("Add holiday >>");
        logic.addHoliday(day, true, "Super holiday!");
        view.showDayInfo(day);
        view.showMessage("Remove holiday >>");
        logic.removeHoliday(day, "", false);
        view.showDayInfo(day);

        day = logic.enterDate(calendar_2020);
        view.showDayInfo(day);
        view.showMessage("Add day off >>");
        logic.addDayOff(day, "Corporate party!");
        view.showDayInfo(day);
        view.showMessage("Remove day off >>");
        logic.removeDayOff(day, "Corporate party canceled = (");
        view.showDayInfo(day);

        view.showCalendar(calendar_2020);
    }

}
