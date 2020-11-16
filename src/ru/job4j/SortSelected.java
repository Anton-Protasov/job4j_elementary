package ru.job4j;

/*
6.5.3. Сортировка выборкой. [#395073]
На первом этапе мы ищем минимальный элемент во всем массиве. Минимальный элемент - это 1.
Меняем местами нулевой элемент и 2 элемент по индексу - это 1.
Теперь повторяем процедуру поиска минимального элемента, но ищем уже не с 0 элемента, а с элемента с индексом 1.
Делаем мы это потому, что в нулевой ячейке уже записан минимальный элемент.

В этом задании мы будем использовать методы, которые уже реализовывали в других задачах.
1. MinDiapason.findMin - этот метод нужен для получения минимально элемента в массиве.
2. FindLoop.indexOf(int[] data, int el, int start, int finish) - этот метод нужен,
чтобы получить индекс элемента, полученного из метода MinDiapason.findMin.
 */

import ru.job4j.array.FindLoop;
import ru.job4j.array.MinDiapason;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int indexMin = FindLoop.indexOf(data, min);
            int var = data[i];
            data[i] = data[indexMin];
            data[indexMin] = var;
            }
        return data;
        }
    }
