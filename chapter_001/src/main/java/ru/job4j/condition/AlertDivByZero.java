package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(-5);
        possibleDiv(0);
        System.out.println(1.0 % 3);
    }

    public static void possibleDiv(int number) {
        boolean result = number < 0;
        if (result) {
            System.out.println("This is negative numbers");
        }
    }
}