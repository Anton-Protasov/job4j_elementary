package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArrayCharTest {

    @Test
    public void whenWordIsNotEqPref() {
        char[] word = new char[] {'J', 'a', 'V', 'a'};
        char[] pref = new char[] {'J', 'a', 'v', 'o'};
        assertThat(ArrayChar.startsWith(word, pref), is(false));
    }

    @Test
    public void whenWordIsEqPref() {
        char[] word = new char[] {'J', 'a', 'v', 'a'};
        char[] pref = new char[] {'J', 'a', 'v', 'a'};
        assertThat(ArrayChar.startsWith(word, pref), is(true));
    }

    @Test
    public void whenWordBigger() {
        char[] word = new char[] {'J', 'a', 'v', 'a', '4', 'j'};
        char[] pref = new char[] {'J', 'a', 'V', 'a'};
        assertThat(ArrayChar.startsWith(word, pref), is(false));
    }

    @Test
    public void whenPrefBigger() {
        char[] pref = new char[] {'J', 'a', 'v', 'a', '4', 'j'};
        char[] word = new char[] {'J', 'a', 'r', 'a'};
        assertThat(ArrayChar.startsWith(word, pref), is(false));
    }
}
