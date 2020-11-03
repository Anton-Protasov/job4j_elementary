package ru.job4j.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(-5);
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(-100);
        AlertDivByZero.possibleDiv(10);
    }
}
