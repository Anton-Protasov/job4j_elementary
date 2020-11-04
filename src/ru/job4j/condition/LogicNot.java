package ru.job4j.condition;

public class LogicNot {

    public boolean isEven(int num) {        // проверяет, что число четное
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {    // проверяет, что число положительное
        return num > 0;
    }

    public boolean notEven(int num) {       // проверяет, что число нечетное
        return !isEven(num);
    }

    public boolean notPositive(int num) {   // проверяет, что число не положительное
        return !isPositive(num);
    }

    public boolean notEvenAndPositive(int num) {    // проверяет, что число нечетное и положительное
        return !isEven(num) && isPositive(num);
    }

    public boolean evenOrNotPositive(int num) {     // проверяет, что число четное или не положительное
        return isPositive(num) || !isPositive(num);
    }
}