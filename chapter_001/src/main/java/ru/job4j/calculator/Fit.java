package ru.job4j.calculator;

/**
 * Package for calculate task.
 *
 * @author Vyacheslav Kovshun (slava.cod4@yandex.ru)
 * @version 1
 * @since 02.02.2020
 */

public class Fit {

    public static double manWeight(double height) {
        return (height-100) * 1.15;
    }


    public static double womanWeight(double height) {
        return (height-110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(180);
        double woman = womanWeight(165);
        System.out.println("Man 180 is " + man);
        System.out.println("woman 165 is " + woman);
    }

}