package ru.job4j.array;

/*
6.5.2. Поиск минимума в диапазоне. [#395075]
*/

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = (start + 1); i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
