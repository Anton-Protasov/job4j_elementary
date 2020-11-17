package ru.job4j.array;

/*
6.7.1. Моно строка в матрице. [#395076]
нужно проверить то, что строка в двухмерном массиве целиком заполнена символом 'X'
6.7.2. Моно столбец в матрице. [#395077]
6.7.3. Массив из диагонали матрицы. [#395078]
В этом задании вам нужно будет заполнить одномерный массив элементами диагонали из двухмерного массива.
6.7.4. Выигрышные комбинации в сокобан [#395069]
Игровое поле представляет собой массив, заполненный символами '_' (подчеркивание) и 'X' - крестик.
Цель игры - расположить крестики в линию на 5 элементов. Элементы X должны располагаться либо вертикально,
либо горизонтально.
Ваша задача - написать метод, который будет проверять, находится ли на поле выигрышная ситуация.
При любой выигрышной комбинации элементы всегда пересекают диагональ.
Это дает нам возможность сократить количество проходов.
Мы определяем координаты элемента в диагонали и проверяем вертикальную и горизонтальную линии.
Для проверки содержимого строки и столбца нужно использовать методы:
(monoHorizontal(board, index) || monoVertical(board, index))
 */

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
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

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
            if (monoHorizontal(board, i) || monoVertical(board, i)) {
                result = true;
                break;
            }
            }
        }
        return result;
    }
}
