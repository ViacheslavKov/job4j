package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void RubleToEuro() {
        int in = 700;
        int expected = 10;
        int out = Converter.RubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void RubleToDollar() {
        int in = 240;
        int expected = 4;
        int out = Converter.RubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void EuroToRuble() {
        int in = 5;
        int expected = 350;
        int out = Converter.EuroToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void DollarToRuble() {
        int in = 10;
        int expected = 600;
        int out = Converter.DollarToRuble(in);
        Assert.assertEquals(expected, out);
    }
}