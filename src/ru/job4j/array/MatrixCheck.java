package ru.job4j.array;

/*
6.7.1. Моно строка в матрице. [#395076]
нужно проверить то, что строка в двухмерном массиве целиком заполнена символом 'X'
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
}
