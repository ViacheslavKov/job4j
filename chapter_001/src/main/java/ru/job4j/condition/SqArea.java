package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = (double) p / (2 * k + 2);
        double L = (double) h * k;
        double result = (double) L * h;
        return result;
    }

    public static void main(String[] args) {
        double result1 = square(100, 10);
        System.out.println(" p = 100, k = 10, s = 206.61, real = " + result1);
    }
}
