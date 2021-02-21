package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PointTest {

    @Test
    public void distance00to02() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(2, 0.001));
    }

    @Test
    public void distance13to24() {
        Point a = new Point(1, 3);
        Point b = new Point(2, 4);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(1.414, 0.001));
    }

    @Test
    public void distance213to152() {
        Point a = new Point(2, 1, 3);
        Point b = new Point(1, 5, 2);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(4.243, 0.001));
    }

    @Test
    public void distance102to210() {
        Point a = new Point(1, 0, 2);
        Point b = new Point(2, 1, 0);
        double rsl = a.distance3d(b);
        assertThat(rsl, closeTo(2.449, 0.001));
    }
}