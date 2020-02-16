package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

    public class SqMaxTest {

        @Test
        public void debugThird() {
            SqMax check = new SqMax();
            int result = check.max(6, 4, 7, 5);
            assertThat(result, is(7));
        }

        @Test
        public void debugFirst() {
            SqMax check = new SqMax();
            int result = check.max(6, 4, 2, 5);
            assertThat(result, is(6));
        }

        @Test
        public void debugForth() {
            SqMax check = new SqMax();
            int result = check.max(10, 8, 4, 15);
            assertThat(result, is(15));
        }

        @Test
        public void debugSecond() {
            SqMax check = new SqMax();
            int result = check.max(10, 35, 4, 15);
            assertThat(result, is(35));
        }
}
