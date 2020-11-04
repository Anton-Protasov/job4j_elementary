package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SwitchWeekTest {

    @Test
    public void whenDay5nameOfDay() {
        SwitchWeek sw = new SwitchWeek();
        assertThat(sw.nameOfDay(5), is("Пятница"));
    }

    @Test
    public void whenDay8nameOfDay() {
        SwitchWeek sw = new SwitchWeek();
        assertThat(sw.nameOfDay(8), is("Ошибка"));
    }
}