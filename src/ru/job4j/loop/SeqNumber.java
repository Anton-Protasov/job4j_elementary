package ru.job4j.loop;

/*
Программа будет выводить на консоль числа, сумма которых равны заданному числу.
Например, задано число 6. Его можно получить, сложив 1, 2, 3.
 */

public class SeqNumber {
    public static void main(String[] args) {
        calc(6);
            calc(10);
    }

    public static void calc(int n) {
        int hold = 0;
        for (int index = 1; index <= n; index++) {
            hold += index;
            System.out.println(index);
            if (hold == n) {
                System.out.println("Success");
                break;
            } else if (hold > n) {
                System.out.println("Not possible");
                break;
            }
        }
    }
}
