package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SquareTest {

    @Test
    public void whenBound5() {
        int[] rsl = Square.calculate(5);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        assertThat(rsl, is(expected));
    }
}