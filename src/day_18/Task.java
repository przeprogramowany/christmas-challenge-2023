package day_18;

import java.time.LocalDateTime;
import java.util.List;

/**
 * W Boże Narodzenie Gwiazdka będzie dostarczała pozostałe prezenty. Program zawiera
 * w liście liczbę minut, które są potrzebne na dostarczenie danego prezentu. Policz
 * o której godzinie Gwiazdka skończy dostarczać pozostałe prezenty jeśli zacznie o północy.
 */
public class Task {

    private static final LocalDateTime CHRISTMAS_DATE = LocalDateTime.of(2024, 12, 25, 0, 0);

    public static void main(String[] args) {
        List<String> numberOfMinutes = List.of("88 min", "75 min", "68 min", "25 min",
                "44 min", "101 min", "44 min", "86 min", "52 min", "12 min");

        // TODO: policz, o której godzinie zostaną dostarczone wszystkie prezenty
    }
}
