package Module3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arrays3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int seed = scan.nextInt();

        double[] array = new double[size];

        Random random = new Random(seed);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * 2;
        }
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        double min = array[0];
        double max = array[array.length - 1];

        System.out.println(min + max);
    }
}
