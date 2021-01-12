package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class PointTest {

    @Test
    public void exampleOne2D() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        double expected = 1.41;
        double out = a.distance(b);
        assertThat(out, closeTo(expected, 0.1));
    }

    @Test
    public void exampleTwo2D() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double expected = 0;
        double out = a.distance(b);
        assertThat(out, closeTo(expected, 0.1));
    }

    @Test
    public void exampleThre3D() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double expected = 1.73;
        double out = a.distance3d(b);
        assertThat(out, closeTo(expected, 0.1));
    }

    @Test
    public void exampleFoure3D() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(1, 1, 1);
        double expected = 0;
        double out = a.distance3d(b);
        assertThat(out, closeTo(expected, 0.1));
    }
}
