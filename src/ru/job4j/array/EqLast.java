package ru.job4j.array;

/*
6.4.1. Сравнить последние элементы двух массивов [#395086]

Альтернативный вариант:
public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean rsl;
        if (left[left.length - 1] == right[right.length - 1]) {
            rsl = true;
        } else {
            rsl = false;
      }
        return rsl;
 */

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        return (left[left.length - 1] == right[right.length - 1]);
    }
}
