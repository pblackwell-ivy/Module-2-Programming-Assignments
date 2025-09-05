package Exercise11_2;

import Exercise10_14.MyDate;

// Design a class Person then extend it to sStudent and Employee, then extend Employee to Faculty and Staff
public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phone, String email, String office, double salary, MyDate dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + getName();
    }
}
