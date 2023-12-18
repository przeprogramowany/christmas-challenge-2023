package day_18;

import java.time.LocalDateTime;
import java.util.List;

/**
 * W Boże Narodzenie Gwiazdka będzie dostarczała pozostałe prezenty. Program zawiera
 * w liście liczbę minut, które są potrzebne na dostarczenie danego prezentu. Policz
 * o której godzinie Gwiazdka skończy dostarczać pozostałe prezenty jeśli zacznie o północy.
 */
public class Solution {

    private static final String MINUTES_PREFIX = " min";
    private static final String EMPTY_STRING = "";
    private static final String HOURS_MINUTES_FORMAT = "%d:%d";

    private static final LocalDateTime CHRISTMAS_DATE = LocalDateTime.of(2024, 12, 25, 0, 0);

    public static void main(String[] args) {
        List<String> numberOfMinutes = List.of("88 min", "75 min", "68 min", "25 min",
                "44 min", "101 min", "44 min", "86 min", "52 min", "12 min");

        int sumOfMinutes = numberOfMinutes.stream()
                .map(value -> value.replace(MINUTES_PREFIX, EMPTY_STRING))
                .mapToInt(Integer::valueOf).sum();

        LocalDateTime deliveryDate = CHRISTMAS_DATE.plusMinutes(sumOfMinutes);

        System.out.printf(HOURS_MINUTES_FORMAT, deliveryDate.getHour(), deliveryDate.getMinute());
    }
}
