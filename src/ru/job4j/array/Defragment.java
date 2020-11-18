package ru.job4j.array;

/*
6.8. Дефрагментация массива [#395093]
необходимо написать код, который будет перемещать заполненные ячейки массива в начало, а пустые в конец.
 */

public class Defragment {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {                             // 1 - определяем, что в массиве есть элемент null

                for (int i = index + 1; i < array.length; i++) {    // 2 - запускаем цикл поиска следующего не null элемента
                    if (array[i] != null) {                         // если такой элемент есть
                        array[index] = array[i];                    // 3 - записываем вместо null элемемнт не null
                        array[i] = null;                            // 4 - записываем вместо не null элемента null
                    break;                                          // 5 - прерываем цикл
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