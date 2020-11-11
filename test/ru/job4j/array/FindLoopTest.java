package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {

    @Test
    public void indexExistInArray() {
        int[] input = new int[] {1, 3, 5, 7, 9};
        assertThat(FindLoop.indexOf(input, 5), is(2));
    }

    @Test
    public void indexNotExistInArray() {
        int[] input = new int[] {1, 3, 5, 7, 9};
        assertThat(FindLoop.indexOf(input, 6), is(-1));
    }
}