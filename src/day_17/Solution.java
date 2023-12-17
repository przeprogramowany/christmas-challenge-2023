package day_17;

import java.util.List;
import java.util.Random;

/**
 * Napisz program, który wylosuje prezent w podanym przedziale cenowym
 * (MAX_GIFT_PRICE) oraz wypisze go na ekranie.
 */
public class Solution {

    private static final Integer MAX_GIFT_PRICE = 100;

    public static void main(String[] args) {
        List<Gift> gifts = prepareListOfGifts();

        List<Gift> filteredGiftsByPrice = filterGiftsByPrice(gifts);
        int randomGiftId = getRandomGiftId(filteredGiftsByPrice);

        System.out.println("Wylosowany prezent: "
                + filteredGiftsByPrice.get(randomGiftId));
    }

    private static List<Gift> filterGiftsByPrice(List<Gift> gifts) {
        return gifts.stream()
                .filter(gift -> gift.price() <= MAX_GIFT_PRICE)
                .toList();
    }

    private static Integer getRandomGiftId(List<Gift> gifts) {
        return new Random().nextInt(gifts.size());
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
