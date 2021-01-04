package ru.job4j.condition;

public class MultiMax {
    /*
    Метод должен возвращать максимум из трех чисел
    Как альтернативный вариант реализации через тернатрную операцию:
    return ((second > first) && (second > third)) ? second : ((third > first) && (third > second)) ? third : first;
     */
    public static int max(int first, int second, int third) {
    int result = first;
    result = (first > second) ? result : second;
    result = (result > third) ? result : third;
    return result;
    }
}