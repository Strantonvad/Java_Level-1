public class FirstLesson {
    static int someInt;
    static boolean someBoolean;
    static String someString;
    static Integer someInteger;

    public static void main(String[] args) {

        someInt = 10;
        someBoolean = true;
        someString = "Some text";
        someInteger = 111;

        int calculateCall = calculate(1, 2, 3, 4);
        System.out.println(calculateCall);

        Boolean checkRangeCall = checkRange(5, 9);
        System.out.println(checkRangeCall);

        String numberPolarityCall = numberPolarity(-5);
        System.out.println(numberPolarityCall);

        Boolean isNumNegativeCall = isNumNegative(-151);
        System.out.println(isNumNegativeCall);

        String sayHiCall = sayHi("Вася");
        System.out.println(sayHiCall);

        String isLeapYearCall = isLeapYear(2020);
        System.out.println(isLeapYearCall);
    }

    //    Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //    где a, b, c, d – входные параметры этого метода;
    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //    Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
    //    от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean checkRange(int a, int b) {
        int summ = a + b;
        return summ >= 10 && summ <= 20;
    }

    //    Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
    //    в консоль положительное ли число передали, или отрицательное;
    public static String numberPolarity(int a) {
        return a >= 0 ? "Число положительное" : "Число отрицательное";
    }

    //    Написать метод, которому в качестве параметра передается целое число,
    //    метод должен вернуть true, если число отрицательное;
    public static Boolean isNumNegative(int a) {
        return a < 0;
    }

    //    Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //    метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static String sayHi(String name) {
        return "Привет, " + name + "!";
    }

    //    Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    public static String isLeapYear(int year) {
        int d = year % 4;
        if (d != 0) {
            return "Год " + year + "- не високосный";
        }
        return "Год " + year + "- високосный";
    }
}
