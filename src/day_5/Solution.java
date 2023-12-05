package day_5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Policz ile dni zostało do Świąt Bożego Narodzenia i wyświetl na ekranie. Jeśli aktualna
 * data będzie po tegorocznych Świętach, policz liczbę dni do najbliższego Bożego Narodzenia :)
 */

public class Solution {
    private static final Integer MONTH_OF_CHRISTMAS = 12;
    private static final Integer DAY_OF_CHRISTMAS = 25;
    private static final Integer NEXT_YEAR = 1;
    private static final Integer SAME_YEAR = 0;

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();

        int christmasYear = nowDate.getYear() + (isDateAfterChristmas(nowDate)
                ? NEXT_YEAR
                : SAME_YEAR);
        LocalDate christmasDate = LocalDate.of(christmasYear, MONTH_OF_CHRISTMAS, DAY_OF_CHRISTMAS);

        long numberOfDaysUntilChristmas = nowDate.until(christmasDate, ChronoUnit.DAYS);
        System.out.println(numberOfDaysUntilChristmas + " dni do Świąt!");
    }

    private static boolean isDateAfterChristmas(LocalDate nowDate) {
        return nowDate.getDayOfMonth() > DAY_OF_CHRISTMAS
                && nowDate.getMonthValue() == MONTH_OF_CHRISTMAS;
    }
}
