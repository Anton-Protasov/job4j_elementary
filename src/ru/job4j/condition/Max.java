package ru.job4j.condition;

/**
 * Определить максимум из 2 или 3 или 4 чисел, используя перегрузку методов
 */

public class Max {

    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int firs, int second, int third) {
        return max(max(firs, second), third);
    }

    public int max(int first, int second, int third, int fourth) {
        return max(max(first, second, third), fourth);
    }
}
