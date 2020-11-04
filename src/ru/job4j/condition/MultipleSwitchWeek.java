package ru.job4j.condition;

// 4.6.2. Switch - matcher [#395055]

public class MultipleSwitchWeek {

/*
На вход поступает строка.
Это название дня недели. Оно может быть как на английском,
так и на русском. Ваша задача - вернуть номер дня недели
 */
    public int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> 0;
        };
    }
}
