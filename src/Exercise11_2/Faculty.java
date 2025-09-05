package Exercise11_2;
import Exercise10_14.MyDate;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email,
                   String office, double salary, MyDate dateHired,
                   String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + getName();
    }
}