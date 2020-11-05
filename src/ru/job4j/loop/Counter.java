package ru.job4j.loop;
/*
Программа, которая подсчитывает сумму чисел от start до finish.
Например, start = 0, finish = 5. Нужно сложить числа: 0, 1, 2, 3, 4, 5. Ответ будет 15.
 */

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int index = start; index  <= finish; index++) {
            sum = sum + index;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}
