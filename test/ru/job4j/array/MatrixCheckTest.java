package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenRowOneisNotfilled() {
        char[][] array = new char[][] {
                                        {'d', 'X', 'a'},
                                        {'X', 'a', 'f'},
                                        {'X', 'X', 'X'},
                                        {'v', 'l', 'X'}
        };
        assertThat(MatrixCheck.monoHorizontal(array, 0), is(false));
    }

    @Test
    public void whenRowTwoisNotfilled() {
        char[][] array = new char[][] {
                {'d', 'X', 'a'},
                {'X', 'a', 'f'},
                {'X', 'X', 'X'},
                {'v', 'l', 'X'}
        };
        assertThat(MatrixCheck.monoHorizontal(array, 1), is(false));
    }

    @Test
    public void whenRowThreeisfilled() {
        char[][] array = new char[][] {
                {'d', 'X', 'a'},
                {'X', 'a', 'f'},
                {'X', 'X', 'X'},
                {'v', 'l', 'X'}
        };
        assertThat(MatrixCheck.monoHorizontal(array, 2), is(true));
    }

    @Test
    public void whenXIsLast() {
        char[][] array = new char[][] {
                {'d', 'X', 'a'},
                {'X', 'a', 'f'},
                {'X', 'X', 'X'},
                {'v', 'l', 'X'}
        };
        assertThat(MatrixCheck.monoHorizontal(array, 3), is(false));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }
}