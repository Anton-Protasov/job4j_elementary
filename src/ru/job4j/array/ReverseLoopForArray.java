package ru.job4j.array;

/*
6.4.1.1. Обход массива с последнего элемента [#395092]
Вывести в консоль только элементы с четными индексами
 */

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers.length - 1 - i) % 2 == 0) {
            System.out.println(
                    "Текущий элемент массива начиная с последнего: "
                            + numbers[numbers.length - 1 - i]
            );
            }
        }
    }
}

