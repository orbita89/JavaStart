package Module3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Задача: из массива убрать все элементы, которые больше или равны заданному числу
public class Arrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int seed = scanner.nextInt();

        int controlElement = scanner.nextInt();

        int[] array = new int[size];

        Random random = new Random(seed);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(14) + 2; //генерирует числа от 0 до 13, добавляем 2, чтобы получить диапазон от 2 до 15
        }

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, controlElement) + 1;// ищем индекс элемента
        if (index >= 0) {
            int[] f = Arrays.copyOfRange(array, 0, index); //убираем лишние элементы
            System.out.println(Arrays.toString(f));
        } else {
            System.out.println("ERROR");
        }
    }
}
