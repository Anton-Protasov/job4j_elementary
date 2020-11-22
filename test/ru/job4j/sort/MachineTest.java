package ru.job4j.sort;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class MachineTest {

    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by16() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 5, 2};
        int[] rsl = machine.change(50, 13);
        assertThat(rsl, is(expected));
    }
}
