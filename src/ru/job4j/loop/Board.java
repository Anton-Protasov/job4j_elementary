package ru.job4j.loop;

/*
5.3. Построить шахматную доску в псевдографике. [#395167]
(Сумма индексов - всегда четное число (которое делится на 2 без остатка))
 */

public class Board {

    public static void paint(int width, int hight) {
        for (int row = 0; row < hight; row++) {
            for (int cell = 0; cell < width; cell++) {
                if (((row + cell) % 2) == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}