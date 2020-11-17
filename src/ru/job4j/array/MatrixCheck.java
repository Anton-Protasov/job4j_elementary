package ru.job4j.array;

/*
6.7.1. Моно строка в матрице. [#395076]
нужно проверить то, что строка в двухмерном массиве целиком заполнена символом 'X'
6.7.2. Моно столбец в матрице. [#395077]
6.7.3. Массив из диагонали матрицы. [#395078]
В этом задании вам нужно будет заполнить одномерный массив элементами диагонали из двухмерного массива.
 */

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'x') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'x') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
}
