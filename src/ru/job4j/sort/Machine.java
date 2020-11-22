package ru.job4j.sort;

import java.util.Arrays;

/*
6.9. Жадный алгоритм. Сдача в кофе машине [#395066]
У вас есть купюра 50, 100 рублей. Вы хотите купить кофе за 35 рублей. Если вы засунули 50 рублей,
то автомат должен вернут 15 рублей (монетами 10 и 5).
Для решения этой задачу нужно использовать жадный алгоритм.
Его смысл очень прост. Мы берем монету наибольшего номинала - 10.
Далее вычитаем из суммы. Если остаток больше 0, то операцию повторяем, а если меньше,
то берем монету номиналом меньше. И так пока не дойдет до монеты в 1 рубль.
решение должно занимать 5-6 строчек кода. В нем нужно использовать
цикл for - для прохода по монетам и while - для проверки равенства.
 */

/* вариант 1

public class Machine {
    //    private final int[] coins = {10, 5, 2, 1};      //1 - создаем коллекцию номиналов монет. Не понятно почему private final?
    int[] coins = new int[]{10, 5, 2, 1};

    public int[] change(int money, int price) {           //2 - money - купюра; price - стоимость покупки
        int[] rsl = new int[100];                         //3 - создаем копилку со сдачей

        int size = 0;                                     //4 - создаем банк с количеством монет (размер нового массива)
        int delta = money - price;                        //5 - размер сдачи, которую должен выдать автомат
        while ((delta) != 0) {                            //6 - пока сдача банк сдачи не равен нулю
            for (int i = 0; i < rsl.length; i++) {        //7 - хаполняем массив резельтата номиналами монет
                for (int j = 0; j < coins.length; j++) {  //8 - перебираем весь массив моент
                    if ((delta - coins[j]) >= 0) {
                        size += 1;
                        rsl[i] = coins[j];
                        delta -= coins[j];
                        break;
                    }
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        Machine machine = new Machine();
        int[] array = machine.change(50, 16);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

 */

public class Machine {
    //    private final int[] coins = {10, 5, 2, 1};
    int[] coins = new int[]{10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];

        int size = 0;
        int delta = money - price;
        for (int j = 0; j < coins.length; j++) {
            while ((delta - coins[j]) >= 0) {
                rsl[size] = coins[j];
                size += 1;
                delta -= coins[j];
                    }
                }
        return Arrays.copyOf(rsl, size);
        }

    public static void main(String[] args) {
        Machine machine = new Machine();
        int[] array = machine.change(50, 16);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}