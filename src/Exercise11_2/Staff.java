package Exercise11_2;
import Exercise10_14.MyDate;

// Design a class Person then extend it to sStudent and Employee, then extend Employee to Faculty and Staff
public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phone, String email,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + getName();
    }
}