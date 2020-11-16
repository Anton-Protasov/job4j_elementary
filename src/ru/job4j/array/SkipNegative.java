package ru.job4j.array;

/*
6.6.3. Двухмерный массив. If. [#395088]
Метод skip должен заменить отрицательные значения в массиве на ноль.
 */

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}
