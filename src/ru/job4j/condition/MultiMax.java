package ru.job4j.condition;

public class MultiMax {
    /*
    Метод должен возвращать максимум из трех чисел
     */
    public static int max(int first, int second, int third) {
    //    return ((second > first) && (second > third)) ? second : ((third > first) && (third > second)) ? third : first;
    int result = first;
    result = (first > second) ? result : second;
    result = (result > third) ? result : third;
    return result;
    }
}