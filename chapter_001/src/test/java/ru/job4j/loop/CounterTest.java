package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {


    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbers() {
        int rsl = Counter.sum(1, 20);
        int expected = 210;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToFiveThenSix() {
        int rsl = Counter.sumByEven(1, 5);
        int expected = 6;
        assertThat(rsl, is(expected));
    }
}
