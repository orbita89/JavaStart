package Module3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Array5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 5;//Примитивные данные. Хранятся стеке переменная не поминяеться после использование в методе
        Integer c = 5; //Тоже не поменяют так же будет 5 так как такие классы как Integer не меняют переменные хотя иммет ссылочную данные
        AtomicInteger b = new AtomicInteger(5);//Можно использовать AtomicInteger что бы переопределять примитивные переменные
        changeValue(x);
        changeValue(c);
        System.out.println(x);
        System.out.println(c);
        System.out.println(b);

        int[][] a = new int[3][2]; //Cсылочный тип данных. После изменений в методоте эта переменная тоже поменяется

        init(a);
//        print(a);
        int[][] array = insertRow1(a, 2);

//        print(array);
//        System.out.println(Arrays.toString(array));
    }

    public static void init(int[][] a){
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                a[i][j] = random.nextInt(11);
            }
        }
    }

    public static void changeValue(int a) {
        a = 10;
    }

    public static void print(int[][] a) {
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] insertRow1(int[][] mas, int k) {//Метод, который копирует массив и добавляет строку
        // в этом случае неменяеться массив а просто клонируется  и так же добавляем строку
        if (k < 0 || k > mas.length) {
            return null;
        }
        int[][] b = new int[mas.length + 1][mas[0].length];
        for (int i = 0; i < k; i++) { //переписываем все до k-й строки
            for (int j = 0; j < mas[i].length; j++) {
                b[i][j] = mas[i][j];
            }
        }
        for (int i = k; i < mas.length; i++) { //переписываем от k-й строки до конца
            for (int j = 0; j < mas[i].length; j++) {
                b[i + 1][j] = mas[i][j];
            }
        }
        //вставка строки
        b[k] = new int[mas[0].length]; //количество столбцов из любой строки возьмем
        return b;
    }
}
