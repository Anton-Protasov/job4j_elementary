package ru.job4j.array;

/*
6.1. Классический поиск перебором. [#395064]
 */

public class FindLoop {
    /*
    Метод должен вернуть индекс элемента
     */
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
