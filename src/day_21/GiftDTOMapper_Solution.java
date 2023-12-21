package day_21;

import day_19.Gift;

/**
 * Programista przygotował dla Mikołaja mapper, który przyjmuje Gift i zwraca GiftDTO.
 * Gift zawiera nazwę prezentu oraz jego wymiary X, Y, Z. GiftDTO zawiera nazwę oraz
 * pole powierzchni wszystkich ścian prezentu, aby można było dobrać rozmiar papieru
 * prezentowego. Programista zapomniał o walidacjach. Zastanów się jakie walidacje
 * powinny zostać dodane i je dopisz. Załóż, że do metody `map(Gift)` jest przekazywana
 * wartość, która nie jest nullem.
 */
public class GiftDTOMapper_Solution {

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
