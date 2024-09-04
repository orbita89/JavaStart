package Module3;

import java.util.Arrays;
import java.util.Collections;

public class Arrays1 {
    public static void main(String[] args) {
        int[] mas = {1, 2, -3, 4, 25, 6, 17, -1, 9, 6};



        String str = Arrays.toString(mas); // перевод массива в строку для печати
        System.out.println(str);
        //Однако, если вы хотите просто «вызвать» или «вывести» массив,
        //нужно понимать,
        //что массив в Java не может быть выведен напрямую в виде строки,
        //как, например, переменная.
        System.out.println(mas[0]);//получиться [I@3feba861 так.
        // Но мы можем указать ключ тогда мы получим значения этого ключа. mas[0] в ключе 0 находится значение 1


        //Cортировка массива по возрастанию Arrays.sort
        Arrays.sort(mas);//сортировка массива по возрастанию инт
        System.out.println(Arrays.toString(mas));//Получить отсортированный массив в виде строки.
        // И так же можно не сохранять в переменную она сохранится в памяти.

        Arrays.sort(mas, 1, 5); //так же можно отсортировать по заданному диапазону.
        System.out.println(Arrays.toString(mas));//Получить отсортированный массив в виде строки

        String[] list = {"Даша", "Яна", "Андрюха", "Ромка"};
        Arrays.sort(list, Collections.reverseOrder());// сортировка в порядке убывания

        System.out.println(Arrays.toString(list));

        String[] names = {"John", "Peter", "Xenia", "Anna", "Alex"};
        Arrays.sort(names);//сортировка возрастания в алфавитном порядке строка
        System.out.println(Arrays.toString(names));


        //Метод Arrays.binarySearch()
        int[] maaal = {1, 2, -3, 4, 25, 6, 17, -1, 9, 6};
        Arrays.sort(maaal);
        System.out.println(Arrays.toString(maaal));
        int ind = Arrays.binarySearch(maaal, 9);//поиск по индексу результат будет 1.
        // Что бы искать по индексу нужно от сортировать


        //Метод Arrays.fill() - заполнение массива
        int[] b = new int[10];
        Arrays.fill(b,0,2,5);
        System.out.println(Arrays.toString(b)); // [5, 5 ... все остальное 0] так как мы поставили по ключам от 0 до 2 ключа
        // 5 а общее количество элементов 10


        //Метод Arrays.copyOf() - копирование массива

        int[] a = {1, 2, 3, 4, 5};
        int[] c = Arrays.copyOf(a, 10); //если длин здесь = 10 больше до допаления 0 [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]
        int[] d = Arrays.copyOf(a, 3); //если длина меньше 3 [1, 2, 3]
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));

        //Метод Arrays.copyOfRange() - копирование части массива
        int[] e = {1, 2, 3, 4, 5};
        int[] f = Arrays.copyOfRange(e, 1, 3); // [2, 3]
        System.out.println(Arrays.toString(f));
    }
}
