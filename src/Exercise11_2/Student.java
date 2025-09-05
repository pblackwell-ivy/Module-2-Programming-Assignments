package Exercise11_2;

// Design a class Person then extend it to sStudent and Employee, then extend Employee to Faculty and Staff

public class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String name, String address, String phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + getName();
    }
}
