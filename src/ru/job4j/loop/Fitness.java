package ru.job4j.loop;
/*
5.4. Протеиновая диета [#395155]
В тренажерный зал пришли новые спортсмены - Иван и Николай.
Иван за месяц увеличивает силу тяги в 3 раза, а Николай - в 2 раза.
Иван хочет узнать, сколько месяцев ему нужно тренироваться, чтобы обогнать Николая в тяге.
 */
public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            ivan = ivan * 3;
            nik = nik * 2;
            month++;
        }
        return month;
    }
}