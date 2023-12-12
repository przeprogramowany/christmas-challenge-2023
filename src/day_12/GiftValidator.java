package day_12;

import java.math.BigDecimal;

/**
 * Programista napisał walidator dla Mikołaja, który służy do sprawdzania czy
 * nazwa oraz cena prezentu jest prawidłowa. Nazwa nie może mieć wartości null
 * i nie może być pusta. Cena musi być większa od zera. Napisz testy, które
 * sprawdzą wszystkie możliwe scenariusze w poniższym kodzie.
 */

public class GiftValidator {

    public void validateGiftProperties(String name, BigDecimal price) {
        validateGiftName(name);
        validateGiftPrice(price);
    }

    private void validateGiftName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid gift name");
        }
    }

    private void validateGiftPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Invalid gift price");
        }
    }
}
