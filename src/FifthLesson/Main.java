package FifthLesson;

public class Main {

    private static Person[] persArray = new Person[5];
    private static String[] FIOs = {"Ivanov Ivan", "Petrov Petr", "Sidorov Mikhail", "Johnson John", "Peterson Bob"};
    private static String[] positions = {"manager", "engineer", "director", "administrator", "plumper"};
    private static String[] emails = {"qqq@mail.com", "petrov@mail.ru", "sidorov@mail.ru",
            "zzz@somemail.net", "bobs@mail.hz"};
    private static Integer[] phoneNumbers = {1212121, 2323232, 5656565, 23423443, 66767676};
    private static Integer[] salaries = {30000, 44000, 25000, 53000, 70000};
    private static Integer[] ages = {32, 43, 28, 56, 47};

    public static void main(String[] args) {
        for (int i = 0; i < persArray.length ; i++) {
            persArray[i] = new Person(FIOs[i], positions[i], emails[i], phoneNumbers[i], salaries[i], ages[i]);
        }

        for (Person person : persArray) {
            if (person.age > 40) {
                person.personToString();
                System.out.println("-----------------");
            }
        }
    }
}
