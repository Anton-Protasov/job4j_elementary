package ru.job4j.array;
/*
6.4.2. Слово заканчивается на ... [#395071]
Проверка, что слово word заканчивается на post
 */
public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
                if (post[post.length - 1 - i] == word[word.length - 1 - i]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
