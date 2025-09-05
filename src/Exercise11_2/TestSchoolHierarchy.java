package Exercise11_2;

import Exercise10_14.MyDate;

// Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.

public class TestSchoolHierarchy {
    public static void main(String[] args) {
        // Create a person, student, employee, faculty, and staff with fake date and invoke their toString() methods

        Person person = new Person("Sally Kofax", "42 Hpple St.", "817-555-1111", "skofax@baseball.com");
        Student student = new Student("Gregor Wilson", "1 Empire Blvd", "201-555-6611", "gwilson86@ivytech.edu", Student.JUNIOR);
        Employee employee = new Employee("Clara Barton", "8249 Woolworth Street, Apt. A", "317-905-5555", "clarabarton@ivytech.edu", "B1234", 61000, new MyDate());
        Faculty faculty = new Faculty("Dr. Bill Walton", "101 Maple St", "415-555-0000", "billwalton@ucla.edu", "unlisted", 3200000, new MyDate(), "MWF 10–12", " Dean of Psychedelics");
        Staff staff = new Staff("Eve Davis", "202 Birch St", "317-555-9999", "eve@example.com", "H1002", 45000, new MyDate(), "Administrator");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
