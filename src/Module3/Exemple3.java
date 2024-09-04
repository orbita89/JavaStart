package Module3;

import java.util.Scanner;

public class Exemple3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = maxSumMethod(a, b);

        System.out.println(result);
    }

    static int maxSumMethod(int a, int b) {

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;

        }
        int max = a;
        int maxSum = sumD(a);
        a++;
        while (a <= b) {
            int sum = sumD(a);
            if (sum > maxSum) {
                maxSum = sum;
                max = a;
            }
        }
        a++;
        return max;
    }

    static int sumD(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }

        return sum;
    }
}
