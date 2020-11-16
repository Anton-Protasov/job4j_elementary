package ru.job4j.array;

/*
6.6.2. Двухмерный массив. Циклы. [#395087]
Метод sum должен сложить все элементы двухмерного массива
 */

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rsl += array[i][j];
            }

        }
        return rsl;
    }
}
