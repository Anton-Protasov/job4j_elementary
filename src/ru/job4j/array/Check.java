package ru.job4j.array;
/*
6.3. Массив заполнен true или false [#395068]
 */

public class Check {
    /*
    Метод должен проверить, что все элементы в массиве являются true или false
{true, true, true} - вернет true; массив однородный, он заполнен true.
{true, false, true} - вернет false; массив не однородный, он заполнен и true и false.
{false, false, false} - вернет true; массив однородный, он заполнен false.
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean i : data) {
            if (i == result) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
