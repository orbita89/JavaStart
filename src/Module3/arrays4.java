package Module3;

import java.util.Random;
import java.util.Scanner;

public class arrays4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        int ind = findMax(ar);
        System.out.println(ind);
    }

    public static void print(int [] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
            if (i < ar.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void init(int[] ar, long seed) {
        Random random = new Random(seed);
        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(-3, 6);
        }
    }

    public static int findMax(int[] args) {
        double maxElement = args[0];
        int maxIndex = 0;

        for (int i = 1; i < args.length; i++) {
            if (args[i] > maxElement) { //args[i] - элемент массива и maxElement - максимальное значение
                maxElement = args[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
