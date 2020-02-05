package ru.job4j.converter;

public class Converter {

    public static int RubleToEuro(int value) {
        return value / 70;
    }

    public static int RubleToDollar(int value) {
        return value / 60;
    }

    public static int EuroToRuble(int value) {
        return value * 70;
    }

    public static int DollarToRuble(int value) {
        return value * 60;
    }

    public static int bestrate2014(int value) {
        return value / 30;
    }

    public static void main(String[] args) {
        int euro = RubleToEuro(140);
        int dollar = RubleToDollar(200);
        int rubletoEU = EuroToRuble(450);
        int rubletoUSD = DollarToRuble(1250);
        int best = bestrate2014(200);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("200 rubles are " + dollar + " dollars.");
        System.out.println("450 euro are " + rubletoEU + " rubles.");
        System.out.println("1250 dollars are " + rubletoUSD + " rubles.");
        System.out.println("200 rubles were " + best + " dollars in 2014.");

        int in = 140;
        int expected = 2;
        int out = RubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int usd = 180;
        int expected1 = 3;
        int out1 = RubleToDollar(usd);
        boolean passed1 = expected1 == out1;
        System.out.println("180 rubles are 3. Test result : " + passed1);

        int rtoe = 2;
        int expected2 = 140;
        int out2 = EuroToRuble(rtoe);
        boolean passed2 = expected2 == out2;
        System.out.println("2 euro are 120. Test result : " + passed2);

        int rtou = 3;
        int expected3 = 180;
        int out3 = DollarToRuble(rtou);
        boolean passed3 = expected3 == out3;
        System.out.println("3 usd are 180. Test result : " + passed3);

    }
}

