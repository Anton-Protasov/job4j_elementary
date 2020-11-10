package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        assertThat(Fitness.calc(95, 90), is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        assertThat(Fitness.calc(90, 95), is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        assertThat(Fitness.calc(50, 90), is(2));
    }

    @Test
    public void whenIvanEquelNik() {
        assertThat(Fitness.calc(90, 90), is(1));
    }
}