package ThirdLesson;

import java.util.Arrays;
import java.util.Scanner;

public class GuessWord {
    static String[] words = {
            "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
            "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
    };

    public static void main(String[] args) {
        int randomInt = (int) (Math.random() * words.length);
        String correctAnswer = words[randomInt];
        String returnedAnswer;
        String userAnswer;
        StringBuilder answerMask = new StringBuilder();
        String wrongAnswer = answerMask.toString();
        String mask = "###############";
        System.out.println("Загадано одно из этих слов: " + Arrays.toString(words));

        do {
            String wordMask = wrongAnswer.length() > 0 ? wrongAnswer : mask;
            System.out.println("Введите загаданное слово:\n" + wordMask);
            answerMask = new StringBuilder(mask);
            Scanner scanner = new Scanner(System.in);
            userAnswer = scanner.nextLine().toLowerCase();

            int i = 0;
            while (i < correctAnswer.length() && i < userAnswer.length()) {
                if(correctAnswer.charAt(i) == userAnswer.charAt(i)) {
                    answerMask.insert(i, userAnswer.charAt(i));
                }
                i++;
            }
            returnedAnswer = answerMask.toString().replaceAll("\\W","");
            wrongAnswer = answerMask.toString();
        } while (!returnedAnswer.equals(userAnswer));

        System.out.println("Поздравляю! Вы угадали!");
    }
}
