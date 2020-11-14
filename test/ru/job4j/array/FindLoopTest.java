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

    @Test
    public void whenFind() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 10;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind() {
        int[] input = new int[] {5, 2, 0, 2, 4};
        int value = 10;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindLast() {
        int[] input = new int[] {5, 2, 0, 2, 4};
        int value = 4;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 4;
        assertThat(result, is(expect));
    }
}
