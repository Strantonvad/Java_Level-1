package FifthLesson;

public class Person {
    String FIO;
    String position;
    String email;
    int phoneNumber;
    int salary;
    int age;

    Person(String FIO, String position, String email, int phoneNumber, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void personToString() {
        System.out.println("Person data:\nFIO: " + FIO + "\nposition: " + position + "\nemail: " + email
                + "\nphoneNumber: " + phoneNumber + "\nsalary: " + salary + "\nage: " + age);
    }
}
