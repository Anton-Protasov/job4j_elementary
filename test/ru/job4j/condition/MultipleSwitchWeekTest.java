package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MultipleSwitchWeekTest {

    @Test
    public void whenNumberOfDayIs2() {
        MultipleSwitchWeek num = new MultipleSwitchWeek();
        assertThat(num.numberOfDay("Вторник"), is(2));
    }

    @Test
    public void whenNumberOfDayIs5() {
        MultipleSwitchWeek num = new MultipleSwitchWeek();
        assertThat(num.numberOfDay("Friday"), is(5));
    }

    @Test
    public void whenNumberOfDayIs0() {
        MultipleSwitchWeek num = new MultipleSwitchWeek();
        assertThat(num.numberOfDay("JavaDay"), is(0));
    }
}