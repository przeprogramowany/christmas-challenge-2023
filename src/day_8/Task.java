package day_8;

import java.util.ArrayList;
import java.util.List;

/**
 * Mikołaj ma dane na temat liczby dostarczonych prezentów w poszczególnych latach.
 * Policz statystyki takie jak:
 * - suma prezentów dostarczonych we wszystkich podanych latach
 * - średnia dostarczonych prezentów ze wszystkich podanych lat
 * - największa liczba prezentów dostarczonych w danym roku
 * - najmniejsza liczba prezentów dostarczonych w danym roku
 */

public class Task {

    public static void main(String[] args) {
        List<GiftStat> giftStats = new ArrayList<>();
        giftStats.add(new GiftStat(2020, 2000));
        giftStats.add(new GiftStat(2021, 1800));
        giftStats.add(new GiftStat(2022, 2800));

        var sum = 0; // TODO: policz sumę
        var avg = 0; // TODO: policz średnią
        var max = 0; // TODO: policz największą liczbę prezentów dostarczonych w danym roku
        var min = 0; // TODO: policz najmniejszą liczbę prezentów dostarczonych w danym roku

        System.out.println("Suma = " + sum);
        System.out.println("Średnia = " + avg);
        System.out.println("Największa liczba dostarczonych prezentów = " + max);
        System.out.println("Najmniejsza liczba dostarczonych prezentów = " + min);
    }
}
