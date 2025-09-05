package Exercise10_14;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class MyDate {
    // data fields
    private int year;
    private int month;  // 0-based, January is 0
    private int day;

    // No-arg constructor - sets date to current date
    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH); // 0-based
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Constructor with a specified elapsed time since midnight, January 1, 1970, in milliseconds
    public MyDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Constructor that constructs a MyDate object with the specified year, month, and day.
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Three getter methods for data fields year, month, and day
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // A method setDate(long elapsedTime) that sets the new date for the object using elapsed time.
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }
}