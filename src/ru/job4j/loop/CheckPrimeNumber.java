package ru.job4j.loop;
/*
5.5. Простое число [#395158]
В этом задании нужно проверить, что число является простым.
Простым считается число, которое делится только на себя и на единицу.
 */

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = (number > 1);           // эта запись заменяет конструкцию с if-else ниже!!!
//        boolean prime = true;
//        if (number == 1) {
//            prime = false;
//        } else {
            for (int integer = 2; integer <= (number - 1); integer++) {
                if ((number % integer) == 0) {
                    prime = false;
                    break;
                }
            }
//        }
        return prime;
    }
}
