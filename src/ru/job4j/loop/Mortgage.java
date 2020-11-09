package ru.job4j.loop;

/*
В этом задании нужно посчитать количество лет, необходимых для погашения кредита.
Кредитная сумма пересчитывается каждый год от остатка суммы, умноженной на процент.
Например, вы взяли кредит на 100 рублей. За год вы зарабатываете 70 рублей. Вам дали кредит на 50% в год.
К концу года вам нужно заплатить 150 рублей. Вы может заплатить 70. Нужно еще доплатить 80 рублей.
amount - сумма выданная по кредиту, salary - годовой доход, percent - процентная ставка по кредиту
 */

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double delta = ((amount + (amount * percent / 100)) - salary);
        while (delta > 0) {
            year++;
            delta = (delta + (delta * percent / 100)) - salary;
        }
        return year;
    }
}
