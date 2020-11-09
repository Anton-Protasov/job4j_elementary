package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class PrimeNumberTest {

    @Test
    public void when5() {
        assertThat(PrimeNumber.calculation(5), is(3));
    }

    @Test
    public void when11() {
        assertThat(PrimeNumber.calculation(11), is(5));
    }

    @Test
    public void when2() {
        assertThat(PrimeNumber.calculation(2), is(1));
    }
}