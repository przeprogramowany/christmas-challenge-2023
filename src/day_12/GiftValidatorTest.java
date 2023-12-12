package day_12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class GiftValidatorTest {

    private GiftValidator validator;

    @BeforeEach
    void setUp() {
        validator = new GiftValidator();
    }

    @Test
    void validateGiftProperties_shouldDoesNotThrowException_ifGiftNameAndPriceAreCorrect() {
        // given
        String giftName = "giftName";
        BigDecimal giftPrice = BigDecimal.TEN;

        // expect
        assertDoesNotThrow(() -> validator.validateGiftProperties(giftName, giftPrice));
    }

    @Test
    void validateGiftProperties_shouldThrowException_ifGiftNameIsNull() {
        // given
        BigDecimal giftPrice = BigDecimal.TEN;

        // when
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validator.validateGiftProperties(null, giftPrice));

        // then
        assertEquals("Invalid gift name", exception.getMessage());
    }

    @Test
    void validateGiftProperties_shouldThrowException_ifGiftNameIsEmpty() {
        // given
        String giftName = "";
        BigDecimal giftPrice = BigDecimal.TEN;

        // when
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validator.validateGiftProperties(giftName, giftPrice));

        // then
        assertEquals("Invalid gift name", exception.getMessage());
    }

    @Test
    void validateGiftProperties_shouldThrowException_ifGiftPriceIsZero() {
        // given
        String giftName = "giftPrice";
        BigDecimal giftPrice = BigDecimal.ZERO;

        // when
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validator.validateGiftProperties(giftName, giftPrice));

        // then
        assertEquals("Invalid gift price", exception.getMessage());
    }

    @Test
    void validateGiftProperties_shouldThrowException_ifGiftPriceIsNegative() {
        // given
        String giftName = "giftPrice";
        BigDecimal giftPrice = new BigDecimal(-10);

        // when
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> validator.validateGiftProperties(giftName, giftPrice));

        // then
        assertEquals("Invalid gift price", exception.getMessage());
    }
}