package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(4, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(4, 6, 1);
        assertThat(result, is(6));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(4, 2, 10);
        assertThat(result, is(10));
    }

    @Test
    public void whenAllEquel() {
        int result = MultiMax.max(4, 4, 4);
        assertThat(result, is(4));
    }
}