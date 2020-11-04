package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        return ((second > first) && (second > third)) ? second : ((third > first) && (third > second)) ? third : first;
    }
}