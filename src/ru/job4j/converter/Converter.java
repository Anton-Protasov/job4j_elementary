package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {

/*        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollars.");
 */
        int inEUR = 140;
        int expectedEUR = 2;
        int outEUR = Converter.rubleToEuro(inEUR);
        boolean testEUR = expectedEUR == outEUR;
        System.out.println("140 rub are 2 Euro. Test result: " + testEUR);

        int inUSD = 180;
        int expectedUSD = 2;
        int outUSD = Converter.rubleToDollar(inUSD);
        boolean testUSD = expectedUSD == outUSD;
        System.out.println("180 rub are 3 Dollar. Test result: " + testUSD);
    }
}
