package day_22;

import day_19.Gift;
import day_21.GiftDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GiftDTOMapper_Test {

    private GiftDTOMapper mapper;

    @BeforeEach
    void setup() {
        mapper = new GiftDTOMapper();
    }

    @Test
    void map_shouldReturnGiftDto_ifPassedGiftContainsCorrectValues() {
        // given
        String givenGiftName = "givenGiftName";
        Integer givenSizeX = 1;
        Integer givenSizeY = 1;
        Integer givenSizeZ = 1;

        // and
        Gift gift = new Gift(givenGiftName, givenSizeX, givenSizeY, givenSizeZ);

        // when
        GiftDTO giftDTO = mapper.map(gift);

        // then
        assertEquals(giftDTO.name(), givenGiftName);
        assertEquals(giftDTO.totalAreaOfWalls(), 6);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void map_shouldThrowException_ifGiftNameIsNullOrEmpty(String givenGiftName) {
        // given
        Integer givenSizeX = 1;
        Integer givenSizeY = 1;
        Integer givenSizeZ = 1;

        // and
        Gift gift = new Gift(givenGiftName, givenSizeX, givenSizeY, givenSizeZ);

        // when
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> mapper.map(gift));

        // then
        assertEquals("Incorrect gift name", exception.getMessage());
    }

    @ParameterizedTest
    @CsvSource(delimiter = '|', textBlock = """
            0  | 1  | 1
            1  | 0  | 1
            1  | 1  | 0
            -1 | 1  | 1
            1  | -1 | 1
            1  | 1  | -1
            """)
    void map_shouldThrowException_ifGiftSizeIsIncorrect(int givenSizeX, int givenSizeY, int givenSizeZ) {
        // given
        String givenGiftName = "givenGiftName";

        // and
        Gift gift = new Gift(givenGiftName, givenSizeX, givenSizeY, givenSizeZ);

        // when
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> mapper.map(gift));

        // then
        assertEquals("Incorrect gift size", exception.getMessage());
    }
}