import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the minimum element
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Find the last occurrence of the minimum element
        int lastIndex = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (array[i] == min) {
                lastIndex = i;
                break;
            }
        }

        // Replace the last minimum element with -1
        array[lastIndex] = -1;

        // Print the modified array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

//        for (int i = 0; i < n; i++) {
//            System.out.printf("%.2f ", array[i]);
//        }
//        System.out.println();
////
////        // расчет среднего значения
//        double average = 0;
//        for (int i = 0; i < n; i++) {
//            average += array[i];
//        }
//        average /= n;
//        System.out.printf("%.2f\n", average);

//        // замена элементов, больших среднего, на среднее
//        for (int i = 0; i < n; i++) {
//            if (array[i] > average) {
//                array[i] = average;
//            }
//        }

        // печать измененного массива
//        for (int i = 0; i < n; i++) {
//            System.out.printf("%.2f ", array[i]);
//        }
//        System.out.println();


//        for (int i = 0; i < seed; i++) {
//            a[i] = rand.nextInt(-5, 2300320);
//            System.out.print(a[i] + " ");
//        }
//
//        System.out.println();
//
//        int sum = 0;
//        double product = 1.0;
//
//        for (int num : a) {
//            if (num >= 0) {
//                sum += num;
//            } else {
//                product *= num;
//            }
//        }
//
//        System.out.println(sum + " " + product);

//        int answer = a.length;
//
//        for (int i = 0; i < a.length; i++) {
//            a[i] = rand.nextInt(1, 6); //числа от -5 до 5
//            System.out.print(a[i] + " ");
//        }
//
//
//        System.out.println();
//
//        int sum = 0;
//
//        for (int j : a) {
//            sum += j;
//        }
//        System.out.println(sum);
//
//        int count = 0;
//
//        for (int j : a) {
//            if (j == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
//
//        double product = 1;
//
//        for (int i = 1; i < a.length; i+= 2) {
//            product *= a[i];
//        }
//
//        System.out.println(product);
//
//        int max = 0;
//
//        for (int j : a) {
//            if (j > max) {
//                max = j;
//            }
//        }
//        System.out.println(max);
    }
};
