package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SortSelectedTest {

    @Test
    public void whenSixElements() {
        int[] data = new int[] {0, -5, 7, 2, -3, 6};
        int[] expected = new int[] {-5, -3, 0, 2, 6, 7};
        assertThat(SortSelected.sort(data), is(expected));
    }

    @Test
    public void whenTwoEquel() {
        int[] data = new int[] {0, -5, 7, -4, -3, -10};
        int[] expected = new int[] {-10, -5, -4, -3, 0, 7};
        assertThat(SortSelected.sort(data), is(expected));
    }

    @Test
    public void whenMinIsFirst() {
        int[] data = new int[] {0, -5, 7, -6, -3, -10};
        int[] expected = new int[] {-10, -6, -5, -3, 0, 7};
        assertThat(SortSelected.sort(data), is(expected));
    }
}