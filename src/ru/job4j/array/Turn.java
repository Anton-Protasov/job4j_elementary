package ru.job4j.array;

/*
6.2.3. Перевернуть массив. [#395082]
 */

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) {
            int var = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = var;
        }
        return array;
    }
}
