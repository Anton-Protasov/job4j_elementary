package ru.job4j.array;

public class FindLoop {

    /*
    6.1. Классический поиск перебором. [#395064]
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

/*
6.5. Поиск индекса в диапазоне. [#395072]
rst = -1 значит, что если элемента нет в массиве, то возвращаем -1.
 */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
            for (int i = start; i <= finish; i++) {
                if (data[i] == el) {
                    rst = i;
                    break;
                }
            }
        return rst;
    }
}