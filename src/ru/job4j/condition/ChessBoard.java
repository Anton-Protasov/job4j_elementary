package ru.job4j.condition;

public class ChessBoard {
/* метод way для фигуры слон (эта фигура двигается только по диагонали)
    координаты x и y изменяются в процессе движения одинаково
*/
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }
}