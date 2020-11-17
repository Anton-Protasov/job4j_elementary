package ru.job4j.array;

/*
6.8. Дефрагментация массива [#395093]
необходимо написать код, который будет перемещать заполненные ячейки массива в начало, а пустые в конец.
 */

public class Defragment {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) { // 1 - определяем, что в массиве есть элемент null

                int point = index; // 2 - запоминаем значение индекса элемент у которого равен null

                for (int i = index; i < array.length; i++) {    // 3 - запускаем цикл поиска следующего не null элемента
                                                                // но проверку осуществляем начиная с индекса элемент
                                                                // элемент которого = null. Иначе, если null - это
                                                                // последний элемент массива - вылезем за пределы
                    if (array[i] != null) {                     // если такой элемент есть
                        array[index] = array[i];                // 4 - записываем вместо null элемемнт не null
                        array[i] = array[point];                // 5 - записываем вместо не null элемента null
                    }
                    break;                                      // 6 - выходим из цикла поиска не null элемента
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed", null};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
