package Module3;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Задача: из массива найти минимальный элемент и заменить его на -1
        //Вводим 3 1 2 3. Первое число - размер массива, второе и третье и тд - элементы массива
        int size = scan.nextInt(); //Первое входного числа получаеться 3 если мы повторно вводим эту же команду то уже число будет 1
        int[] array = new int[size]; //создаем массив с размером 3
        int index_min = 0, min = Integer.MAX_VALUE; //индекс минимального элемента и минимальное значение
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt(); //заполняем массив так как у нас уже использовалась то следовательнно 1 2 3 сохраняеться в массив
            if (array[i] <= min) { //находим минимальное значение и его индекс значало у нас идёт число 1 потом 2 3 так как они самое меньшее то это и будет минимальное число
                min = array[i]; //минимальное значение(элемент)
                index_min = i; //индекс минимального значения(элемент)
            }
        }
        array[index_min] = -1; //заменяем минимальное значение на -1
        for (int el : array) // el - элемент массива
            System.out.print(el + " "); //печатаем массив + пробел
    }
}