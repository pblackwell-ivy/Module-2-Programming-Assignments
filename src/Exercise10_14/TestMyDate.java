package Exercise10_14;

// Write a test program that creates two MyDate objects (using new MyDate() and new MyDate(34355555133101L))
// and displays their year, month, and day.
public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.println("Date1: " + date1.getYear() + "-" + (date1.getMonth() + 1) + "-" + date1.getDay());
        System.out.println("Date2: " + date2.getYear() + "-" + (date2.getMonth() + 1) + "-" + date2.getDay());
    }
}
