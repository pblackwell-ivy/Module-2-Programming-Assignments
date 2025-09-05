package Exercise11_2;

// Design a class Person then extend it to sStudent and Employee, then extend Employee to Faculty and Staff
public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }
}
