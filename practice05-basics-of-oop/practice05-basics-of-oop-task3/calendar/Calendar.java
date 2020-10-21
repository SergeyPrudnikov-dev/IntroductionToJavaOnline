package by.jonline.practice05.oop.task3.calendar;

import java.util.HashMap;
import java.util.Map;

//Создать класс Календарь с внутренним классом, с помощью объектов которого
//можно хранить информацию о выходных и праздничных днях.

public class Calendar {

    private boolean leapYear;

    private Map<Integer, Month> year_2020;

    public Calendar(boolean leapYear, Map<Integer, Month> year_2020) {
        super();
        this.leapYear = leapYear;
        this.year_2020 = year_2020;
    }

    public Calendar() {
        this.leapYear = true;
        this.year_2020 = new HashMap<Integer, Month>();
    }

    public boolean isLeapYear() {
        return leapYear;
    }

    public void setLeapYear(boolean leapYear) {
        this.leapYear = leapYear;
    }

    public Map<Integer, Month> getYear_2020() {
        return year_2020;
    }

    public void setYear_2020(Map<Integer, Month> year_2020) {
        this.year_2020 = year_2020;
    }

    public class Month {
        Integer numberMonth;
        Map<Integer, Day> month_2020;

        public Month(Integer numberMonth) {
            this.numberMonth = numberMonth;
            this.month_2020 = new HashMap<Integer, Day>();
        }

        public Month() {
        }

        public Map<Integer, Day> getMonth_2020() {
            return month_2020;
        }

        public void setMonth_2020(Map<Integer, Day> month_2020) {
            this.month_2020 = month_2020;
        }

        public class Day {
            private DayOfWeek dayOfWeek;
            private Integer number;
            private Integer month;
            private Integer year;
            private boolean dayOff;
            private boolean holiday;
            private String reminder;

            public Day(DayOfWeek dayOfWeek, Integer number, Integer month, Integer year, boolean dayOff,
                    boolean holiday, String reminder) {
                super();
                this.dayOfWeek = dayOfWeek;
                this.number = number;
                this.month = month;
                this.year = year;
                this.dayOff = dayOff;
                this.holiday = holiday;
                this.reminder = reminder;
            }

            public Day() {
            }

            public DayOfWeek getDayOfWeek() {
                return dayOfWeek;
            }

            public void setDayOfWeek(DayOfWeek dayOfWeek) {
                this.dayOfWeek = dayOfWeek;
            }

            public Integer getNumber() {
                return number;
            }

            public void setNumber(Integer number) {
                this.number = number;
            }

            public Integer getMonth() {
                return month;
            }

            public void setMonth(Integer month) {
                this.month = month;
            }

            public Integer getYear() {
                return year;
            }

            public void setYear(Integer year) {
                this.year = year;
            }

            public boolean isDayOff() {
                return dayOff;
            }

            public void setDayOff(boolean dayOff) {
                this.dayOff = dayOff;
            }

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getReminder() {
                return reminder;
            }

            public void setReminder(String reminder) {
                this.reminder = reminder;
            }

        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (leapYear ? 1231 : 1237);
        result = prime * result + ((year_2020 == null) ? 0 : year_2020.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Calendar other = (Calendar) obj;
        if (leapYear != other.leapYear)
            return false;
        if (year_2020 == null) {
            if (other.year_2020 != null)
                return false;
        } else if (!year_2020.equals(other.year_2020))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Calendar [leapYear=" + leapYear + ", year_2020=" + year_2020 + "]";
    }

}
