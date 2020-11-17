package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenRowOneisNotfilled() {
        char[][] array = new char[][] {
                                        {'d', 'x', 'a'},
                                        {'x', 'a', 'f'},
                                        {'x', 'x', 'x'},
                                        {'v', 'l', 'x'}
        };
        assertThat(MatrixCheck.monoHorizontal(array, 0), is(false));
    }

    @Test
    public void whenRowTwoisNotfilled() {
        char[][] array = new char[][] {
                {'d', 'x', 'a'},
                {'x', 'a', 'f'},
                {'x', 'x', 'x'},
                {'v', 'l', 'x'}
        };
        assertThat(MatrixCheck.monoHorizontal(array, 1), is(false));
    }

    @Test
    public void whenRowThreeisfilled() {
        char[][] array = new char[][] {
                {'d', 'x', 'a'},
                {'x', 'a', 'f'},
                {'x', 'x', 'x'},
                {'v', 'l', 'x'}
        };
        assertThat(MatrixCheck.monoHorizontal(array, 2), is(true));
    }

    @Test
    public void whenXIsLast() {
        char[][] array = new char[][] {
                {'d', 'x', 'a'},
                {'x', 'a', 'f'},
                {'x', 'x', 'x'},
                {'v', 'l', 'x'}
        };
        assertThat(MatrixCheck.monoHorizontal(array, 3), is(false));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'x'},
                {' ', ' ', 'x'},
                {' ', ' ', 'x'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }
}