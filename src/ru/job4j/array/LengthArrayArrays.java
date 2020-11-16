package ru.job4j.array;

/*
6.6.4. Размер элемента двухмерного массива. [#395091]
Создайте двумерный массив и сразу его заполните по аналогии с описанием. Только с некоторыми оговорками -
внутри должно быть 4 массива, при этом в первом - 1 элемент, во втором - 2, третьем - 3, четвертом - 4.
Выведите в консоль размер каждого вложенного массива.
 */

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{10}, {20, 30}, {40, 50, 60}, {70, 80, 90, 100}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}
