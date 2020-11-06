package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        assertThat(CheckPrimeNumber.check(5), is(true));
    }

    @Test
    public void when4() {
        assertThat(CheckPrimeNumber.check(4), is(false));
    }

    @Test
    public void when1() {
        assertThat(CheckPrimeNumber.check(1), is(false));
    }
}