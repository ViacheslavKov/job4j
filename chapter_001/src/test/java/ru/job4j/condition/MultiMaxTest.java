package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax2() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax1() {
        MultiMax check = new MultiMax();
        int result = check.max(20, 5, 7);
        assertThat(result, is(20));
    }

    @Test
    public void whenSecondMax3() {
        MultiMax check = new MultiMax();
        int result = check.max(10, 8, 30);
        assertThat(result, is(30));
    }
    @Test
    public void whenSecondMax4() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 1, 1);
        assertThat(result, is(1));
    }
}