package ru.job4j.array;

/*
6.4. Слово начинается с ... [#395067]
Метод принимает два массива символов. В цикле for вам нужно сравнить значения ячеек с одинаковым индексом.
Если все ячейки из массива pref соответствуют таким же ячейкам в массиве word, значит, нужно вернуть true.
В JDK есть класс String. В нем есть метод startsWith. Этот метод проверяет, что слово начинается c
определенной последовательности.
 */

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        if (word.length > pref.length) {
        for (int i = 0; i < pref.length; i++) {
            if (word[i] == pref[i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        } else {
            for (int i = 0; i < word.length; i++) {
                if (word[i] == pref[i]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
