package ru.job4j.loop;

/*
5.7. Ипотека [#395157]
В этом задании нужно посчитать количество лет, необходимых для погашения кредита.
Кредитная сумма пересчитывается каждый год от остатка суммы, умноженной на процент.
Например, вы взяли кредит на 100 рублей. За год вы зарабатываете 70 рублей. Вам дали кредит на 50% в год.
К концу года вам нужно заплатить 150 рублей. Вы может заплатить 70. Нужно еще доплатить 80 рублей.
amount - сумма выданная по кредиту, salary - годовой доход, percent - процентная ставка по кредиту
 */

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            year++;
            amount = (amount + (amount * percent / 100)) - salary;
        }
        return year;
    }
}
