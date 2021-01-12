package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void exampleOne() {
        Max example = new Max();
        assertThat(example.max(1, 2), is(2));
    }

    @Test
    public void exampleTwo() {
        Max example = new Max();
        assertThat(example.max(2, 1, 0), is(2));
    }

    @Test
    public void exampleThree() {
        Max example = new Max();
        assertThat(example.max(4, 7, 5, 6), is(7));
    }
}