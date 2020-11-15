package ru.job4j.array;

/*
6.5.1. Поиск минимального числа в массиве. [#395074]
 */

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}

