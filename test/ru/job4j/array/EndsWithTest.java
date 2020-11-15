package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EndsWithTest {

    @Test
    public void ifEndsAreMeet() {
        char[] word = new char[] {'R', 'o', 'b', 'o', 't'};
        char[] post = new char[] {'R', 'o', 'b', 'o', 't'};
        assertThat(EndsWith.endsWith(word, post), is(true));
    }

    @Test
    public void ifEndsAreNotMeet() {
        char[] word = new char[] {'R', 'o', 'b', 'o', 't'};
        char[] post = new char[] {'b', 'o', 'r'};
        assertThat(EndsWith.endsWith(word, post), is(false));
    }
}
