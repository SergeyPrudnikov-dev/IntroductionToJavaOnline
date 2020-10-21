package by.jonline.practice05.oop.task3.logic;

import by.jonline.practice05.oop.task3.calendar.Calendar;
import by.jonline.practice05.oop.task3.calendar.Calendar.Month;
import by.jonline.practice05.oop.task3.calendar.Calendar.Month.Day;
import by.jonline.practice05.oop.task3.calendar.DayOfWeek;
import by.jonline.practice05.oop.task3.view.View;

//Создать класс Календарь с внутренним классом, с помощью объектов которого
//можно хранить информацию о выходных и праздничных днях.

public class Logic {

    public Logic() {
    }

    public Calendar createCalendar_2020() {
        Integer numberMonth;
        Integer amountDays;
        int numberDay = 2; // 01.01.2020 DayOfWeek.WEDNESDAY(3/7)

        Calendar calendar_2020 = new Calendar();

        for (numberMonth = 1; numberMonth < 13; numberMonth++) { // creating months

            Calendar.Month month = calendar_2020.new Month(numberMonth);

            if (numberMonth == 4 || numberMonth == 6 || numberMonth == 9 || numberMonth == 11)
                amountDays = 30;
            else if (numberMonth == 2)
                amountDays = 29;
            else
                amountDays = 31;

            for (int j = 1; j <= amountDays; j++) { // create days
                DayOfWeek dayOfWeek;
                dayOfWeek = DayOfWeek.values()[numberDay];
                numberDay++;
                if (numberDay == 7)
                    numberDay = 0;

                boolean dayOff = false;
                if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
                    dayOff = true;
                }

                Month.Day day = month.new Day(dayOfWeek, j, numberMonth, 2020, dayOff, false, "");
                month.getMonth_2020().put(j, day);
            }

            calendar_2020.getYear_2020().put(numberMonth, month);
        }

        return calendar_2020;
    }

    public void addHoliday(Day day, boolean dayOff, String reminder) {
        day.setHoliday(true);
        day.setDayOff(dayOff);
        day.setReminder(reminder);
    }

    public void removeHoliday(Day day, String reminder, boolean dayOff) {
        day.setHoliday(false);
        day.setDayOff(dayOff);
        day.setReminder(reminder);
    }

    public void addDayOff(Day day, String reminder) {
        day.setDayOff(true);
        day.setReminder(reminder);
    }

    public void removeDayOff(Day day, String reminder) {
        day.setDayOff(false);
        day.setReminder(reminder);
    }

    public boolean dateValidation(Calendar calendar_2020, Integer numberDay, Integer numberMonth) {
        if (numberMonth <= 0 || numberMonth > 12 || numberDay < 1)
            return false;

        if (numberMonth == 4 || numberMonth == 6 || numberMonth == 9 || numberMonth == 11) {
            if (numberDay > 30)
                return false;
        } else if (numberMonth == 2) {
            if (numberDay > 29)
                return false;
        } else {
            if (numberDay > 31)
                return false;
        }
        return true;
    }

    public Day enterDate(Calendar calendar_2020) {
        View view = new View();
        Integer numberDay = 0;
        Integer numberMonth = 0;
        Day day;
        int i = 0;

        while (!dateValidation(calendar_2020, numberDay, numberMonth)) {
            if (i > 0) {
                view.showMessage("Date entry error, invalid value!");
            }
            numberDay = view.enterInt(" Input number day>>");
            numberMonth = view.enterInt(" Input number month>>");
            i++;
        }

        day = calendar_2020.getYear_2020().get(numberMonth).getMonth_2020().get(numberDay);
        return day;
    }
}
