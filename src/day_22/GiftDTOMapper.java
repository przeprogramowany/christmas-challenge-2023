package day_22;

import day_19.Gift;
import day_21.GiftDTO;

/**
 * Bazując na rozwiązaniu poprzedniego zadania napisz testy jednostkowe z użyciem
 * JUnit lub Spock Framework, które przetestują wszystkie możliwe scenariusze
 * w poniższym kodzie.
 */
public class GiftDTOMapper {

    private static final String INCORRECT_GIFT_NAME = "Incorrect gift name";
    private static final String INCORRECT_GIFT_SIZE = "Incorrect gift size";
    private static final Integer TWO_WALLS = 2;

    public GiftDTO map(Gift gift) {
        validateName(gift.name());
        validateSizes(gift);

        return mapToGiftDTO(gift);
    }

    private void validateName(String giftName) {
        if (giftName == null || giftName.isBlank()) {
            throw new IllegalArgumentException(INCORRECT_GIFT_NAME);
        }
    }

    private void validateSizes(Gift gift) {
        if (gift.sizeX() <= 0 || gift.sizeY() <= 0 || gift.sizeZ() <= 0) {
            throw new IllegalArgumentException(INCORRECT_GIFT_SIZE);
        }
    }

    private GiftDTO mapToGiftDTO(Gift gift) {
        int totalAreaOfWalls = calculateTotalAreaOfWalls(gift);

        return new GiftDTO(gift.name(), totalAreaOfWalls);
    }

    private int calculateTotalAreaOfWalls(Gift gift) {
        return calculateWalls(gift.sizeX(), gift.sizeY())
                + calculateWalls(gift.sizeX(), gift.sizeZ())
                + calculateWalls(gift.sizeY(), gift.sizeZ());
    }

    private static int calculateWalls(Integer firstSize, Integer secondSize) {
        return TWO_WALLS * firstSize * secondSize;
    }
}
