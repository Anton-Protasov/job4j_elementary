package ru.job4j.array;

/*
6.1. Классический поиск перебором. [#395064]
6.5. Поиск индекса в диапазоне. [#395072]
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
/*
Поиск индекса в диапазоне
 */

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
            for (int i = start; i <= finish; i++) {
                if (data[i] == el) {
                    rst = i;
                    break;
                } else {
                    rst = -1;
                }
            }
        return rst;
    }
}
