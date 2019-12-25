import java.util.Arrays;

public class SecondLesson {

    static boolean checkBalance(int[] array) {
        boolean arePartsEqual = false;
        for (int i = 1, j = array.length - 1; i < array.length; i++, j--) {
            int summLeft = 0;
            int summRight = 0;
            summLeft += array[i];
            summRight += array[j];
            if(summLeft == summRight) {
                arePartsEqual = true;
                break;
            }
        }
        return arePartsEqual;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        // С помощью цикла и условия заменить 0 на 1, 1 на 0
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 1;
            } else if (numbers[i] == 1) {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));


        // числа меньшие 6 умножить на 2
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(numbers));


        // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] twoDimensional = new int[5][5];
        for (int i = 0; i < twoDimensional.length; i++) {
            for (int j = 0; j < twoDimensional[i].length; j++) {
                if (i == j) {
                    twoDimensional[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(twoDimensional));


        //  Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] array = new int[]{7, 5, 3, 2, 11, 4, 5, 1, 4, 8, 9, 5};

        int min = array[0];
        int max = array[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Максимальное число в массиве: " + array[maxIndex] + ", его индекс: " + maxIndex);
        System.out.println("Минимальное число в массиве: " + array[minIndex] + ", его индекс: " + minIndex);


        //  Написать метод, в который передается не пустой одномерный целочисленный массив,
        //  метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        int[] anotherArray = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        boolean arePartsEqual = checkBalance(anotherArray);
        System.out.println(arePartsEqual);
    }
}
