package day_11;

import java.util.HashMap;
import java.util.Map;

/**
 * Napisz program, który sprawdzi czy podana lista prezentów mieści się w zakresie cenowym
 * 150 zł. Wypisz wynik na ekranie. Jeśli łączna cena będzie wyższa niż 150 zł, wyświetl
 * na ekranie o ile dokładnie została przekroczona.
 */

public class Solution {

    private static final Integer MAX_PRICE = 150;

    public static void main(String[] args) {
        Map<String, Integer> giftPriceMap = prepareMapOfGiftPrices();

        int totalPriceOfGifts = giftPriceMap.values().stream().mapToInt(Integer::intValue).sum();
        boolean isTotalPriceOfGiftsLowerThanMaxPrice = totalPriceOfGifts <= MAX_PRICE;

        System.out.println("Czy lista prezentów mieści się w zakresie cenowym?");
        System.out.printf(isTotalPriceOfGiftsLowerThanMaxPrice
                ? "Tak"
                : "Nie. Cena przekroczona o %d zł", totalPriceOfGifts - MAX_PRICE);
    }

    private static Map<String, Integer> prepareMapOfGiftPrices() {
        Map<String, Integer> giftPriceMap = new HashMap<>();

        giftPriceMap.put("Java. Efektywne programowanie.", 59);
        giftPriceMap.put("Kostka Rubika", 30);
        giftPriceMap.put("Skarpetki z motywem świątecznym", 19);
        giftPriceMap.put("Słodycze", 45);

        return giftPriceMap;
    }
}
