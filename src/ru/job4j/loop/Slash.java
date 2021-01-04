package ru.job4j.loop;

/*
5.9. Крест в псевдографике. [#395159]
if (row == cell) - Рисуем диагональ слева - направо (сверху - вниз)
else if ((row + cell) == (size - 1)) - Рисуем диагональ справа - налево (сверху - вниз)
 */

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                if (row == cell) {
                    System.out.print("X");
                } else if ((row + cell) == (size - 1)) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
