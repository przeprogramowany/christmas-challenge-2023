package day_17;

import java.util.List;

/**
 * Napisz program, który wylosuje prezent w podanym przedziale cenowym
 * (MAX_GIFT_PRICE) oraz wypisze go na ekranie.
 */
public class Task {

    private static final Integer MAX_GIFT_PRICE = 100;

    public static void main(String[] args) {
        List<Gift> gifts = prepareListOfGifts();

        // TODO: napisz program, który wylosuje prezent w podanym przedziale
        //       cenowym (MAX_PRICE) i wypisze go na ekranie
    }

    private static List<Gift> prepareListOfGifts() {
        return List.of(
                new Gift("Książka", 40),
                new Gift("LEGO", 350),
                new Gift("Tablet", 600),
                new Gift("Piłka", 100),
                new Gift("Bluza", 200),
                new Gift("Puzzle", 50),
                new Gift("Słuchawki", 90),
                new Gift("Słodycze", 30)
        );
    }
}
