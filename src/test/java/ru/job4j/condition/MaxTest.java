package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void maxSecond() {
        Max a = new Max();
        int rsl = a.max(1, 5, 3, 4);
        assertThat(rsl, is(5));
    }

    @Test
    public void maxThird() {
        Max b = new Max();
        int rsl = b.max(0, 5, 13);
        assertThat(rsl, is(13));
    }

    @Test
    public void maxFourth() {
        Max c = new Max();
        int rsl = c.max(11, 2, 0, 15);
        assertThat(rsl, is(15));
    }

    @Test
    public void maxLeft() {
        Max d = new Max();
        int rsl = d.max(1, 2);
        assertThat(rsl, is(2));
    }
}