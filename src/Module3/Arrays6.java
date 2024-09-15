package Module3;

import java.util.Random;
import java.util.Scanner;

public class Arrays6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        printMaxIndex(mas);
    }

    static void initArray(int[][] mas, long seed) {
        Random rand = new Random(seed);

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(0, 11);
            }
        }
    }

    static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void printMaxIndex(int[][] array) {
        for (int[] row : array) {
            int maxIndex = findMax(row);
            System.out.print(maxIndex + " ");
        }
        System.out.println();
    }

    // Метод поиска индекса первого максимального элемента в строке
    public static int findMax(int[] row) {
        int maxIndex = 0;
        int maxValue = row[0];
        for (int i = 1; i < row.length; i++) {
            if (row[i] > maxValue) {
                maxValue = row[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
