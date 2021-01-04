package ru.job4j.array;

/*
6.8. Дефрагментация массива [#395093]
необходимо написать код, который будет перемещать заполненные ячейки массива в начало, а пустые в конец.
1 - определяем, что в массиве есть элемент null
2 - запускаем цикл поиска следующего не null элемента
3 - записываем вместо null элемемнт не null
4 - записываем вместо не null элемента null
5 - прерываем цикл
 */

public class Defragment {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        array[index] = array[i];
                        array[i] = null;
                    break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"wanna", null, "be", null, "compressed", null};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}