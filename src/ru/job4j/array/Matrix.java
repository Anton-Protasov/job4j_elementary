package ru.job4j.array;

/*
6.6.8. Двухмерный массив. Таблица умножения. [#395065]
В ячейки массива нужно записать элементы таблицы умножения.
Элементы получать перемножением индексов.
 */

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i + 1) * (j + 1);
//                System.out.print(table[i][j] + "  ");
            }
//            System.out.println();
        }
        return table;
    }
/*
    public static void main(String[] args) {
        multiple(5);
    }
 */
}
