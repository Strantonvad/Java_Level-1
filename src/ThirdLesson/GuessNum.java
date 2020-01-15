package ThirdLesson;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    static int range = 10;

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int attempts = 3;

        System.out.println("Игра \"Угадай число\".");
        do {
            System.out.println("Введите число в диапазоне от 0 до " + (range - 1) + ":");

            Random rand = new Random();
            int randomNumber = rand.nextInt(range);

            for (int i = 0; i < attempts; i++) {
                boolean userAnswer = guessTheNumber(randomNumber);
                if (userAnswer) {
                    break;
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        } while (!k.next().equalsIgnoreCase("0"));
    }

    public static boolean guessTheNumber(int randomNumber) {
        Scanner sc = new Scanner(System.in);
        String insertedNumber = sc.nextLine();

        if (!isInteger(insertedNumber)) {
            System.out.println("Необходимо ввести целое число!");
        } else {
            int userNumber = Integer.parseInt(insertedNumber);
            if(userNumber > range - 1 || userNumber < 0) {
                System.out.println("Вы ввели число, выходящее за пределы загаданного диапазона.");
            } else {
                if(userNumber > randomNumber) {
                    System.out.println("Вы ввели слишком большое число.");
                } else if (userNumber < randomNumber) {
                    System.out.println("Вы ввели слишком маленькое число.");
                } else {
                    System.out.println("Поздравляю! Вы угадали!!!");
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException | NullPointerException e) {
            return false;
        }

        return true;
    }
}
