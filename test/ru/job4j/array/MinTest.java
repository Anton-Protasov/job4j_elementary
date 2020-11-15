package ru.job4j.array;

import org.junit.Test;
import  static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinTest {

    @Test
    public void whenMinIs0Element() {
        int[] array = new int[] {0, 5, 10};
        assertThat(Min.findMin(array), is(0));
    }

    @Test
    public void whenMinIs3Element() {
        int[] array = new int[] {10, 5, 3};
        assertThat(Min.findMin(array), is(3));
    }

    @Test
    public void whenMinIs2Element() {
        int[] array = new int[] {10, 2, 5};
        assertThat(Min.findMin(array), is(2));
    }
}