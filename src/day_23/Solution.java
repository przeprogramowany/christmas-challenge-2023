package day_23;

import java.util.List;

/**
 * Mikołaj chce wysłać przygotowane prezenty za pomocą Paczkomatu. Ma wymiary skrytki
 * i chciałby wiedzieć czy każdy z podanych prezentów się do niej zmieści (każdy osobno).
 * Znajdź i wypisz w konsoli prezenty, które nie zmieszczą się w skrytce Paczkomatu.
 * Prezent nie zmieści się wtedy, gdy dany wymiar jest przekroczony (jeśli jest taki sam
 * to znaczy, że się zmieści).
 * Pamiętaj, że każdą paczkę można włożyć do skrytki na różne sposoby :)
 */
public class Solution {

    private static final Integer BOX_SIZE_X = 20;
    private static final Integer BOX_SIZE_Y = 30;
    private static final Integer BOX_SIZE_Z = 15;

    private static final Integer SMALLEST_SIZE_INDEX = 0;
    private static final Integer MEDIUM_SIZE_INDEX = 1;
    private static final Integer LARGEST_SIZE_INDEX = 2;


    public static void main(String[] args) {
        var gifts = prepareListOfGifts();

        gifts.forEach(gift -> {
            var sortedSizes = getSortedSizes(gift.sizes());

            var smallestSize = sortedSizes.get(SMALLEST_SIZE_INDEX);
            var mediumSize = sortedSizes.get(MEDIUM_SIZE_INDEX);
            var largestSize = sortedSizes.get(LARGEST_SIZE_INDEX);

            if (isAnyGiftSizeBiggerThanBoxSize(smallestSize, mediumSize, largestSize)) {
                System.out.printf("%s nie zmieści się do skrytki.%n", gift.name());
            }
        });
    }

    private static List<Integer> getSortedSizes(List<Integer> giftSizes) {
        return giftSizes.stream().sorted().toList();
    }

    private static boolean isAnyGiftSizeBiggerThanBoxSize(int smallestSize,
                                                          int mediumSize,
                                                          int largestSize) {
        return smallestSize > BOX_SIZE_Z || mediumSize > BOX_SIZE_X || largestSize > BOX_SIZE_Y;
    }

    private static List<Gift> prepareListOfGifts() {
        return List.of(
                new Gift("Piłka", List.of(5, 5, 5)),
                new Gift("Komputer", List.of(30, 20, 20)),
                new Gift("Samochód zdalnie sterowany", List.of(6, 3, 5)),
                new Gift("Ekspres do kawy", List.of(30, 15, 20)),
                new Gift("Zestaw narzędzi", List.of(20, 20, 20)),
                new Gift("Klawiatura", List.of(2, 5, 20))
        );
    }
}
