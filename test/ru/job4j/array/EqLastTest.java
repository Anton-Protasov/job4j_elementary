package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class EqLastTest {

    @Test
    public void ifFalse() {
        int[] left = new int[] {1, 2, 4, 100500};
        int[] right = new int[] {10500, 1, 4, 105};
        assertThat(EqLast.check(left, right), is(false));
    }

    @Test
    public void ifTrue() {
        int[] left = new int[] {1, 2, 4, 90};
        int[] right = new int[] {10500, 1, 4, 70, 0, 90};
        assertThat(EqLast.check(left, right), is(true));
    }
}