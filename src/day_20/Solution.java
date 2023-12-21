package day_20;

import day_19.Gift;

import java.util.List;

/**
 * Mikołaj chce policzyć, ile metrów kwadratowych papieru prezentowego będzie potrzebował,
 * aby spakować wszystkie prezenty z przygotowanej listy. Wymiary prezentów są podane w centymetrach.
 * Policz, ile metrów kwadratowych papieru prezentowego będzie musiał kupić Mikołaj, aby je spakować.
 */
public class Solution {

    private static final Integer TWO_WALLS = 2;
    private static final Double ONE_SQUARE_METER_IN_CENTIMETERS = 100.0 * 100.0;

    public static void main(String[] args) {
        List<Gift> gifts = prepareListOfGifts();

        int totalAreaOfWallsInCentimeters = gifts.stream()
                .mapToInt(gift -> calculateWalls(gift.sizeX(), gift.sizeY())
                        + calculateWalls(gift.sizeX(), gift.sizeZ())
                        + calculateWalls(gift.sizeY(), gift.sizeZ()))
                .sum();

        double totalAreaOfWallsInMeters = totalAreaOfWallsInCentimeters / ONE_SQUARE_METER_IN_CENTIMETERS;

        System.out.printf("Na spakowanie prezentów potrzeba %.2f m^2 papieru prezentowego", totalAreaOfWallsInMeters);
    }

    private static int calculateWalls(Integer firstSize, Integer secondSize) {
        return TWO_WALLS * firstSize * secondSize;
    }

    private static List<Gift> prepareListOfGifts() {
        return List.of(
                new Gift("Piłka", 30, 30, 30),
                new Gift("Komputer", 45, 50, 20),
                new Gift("Samochód zdalnie sterowany", 20, 10, 7),
                new Gift("Ekspres do kawy", 40, 40, 40),
                new Gift("Klawiatura", 40, 10, 3)
        );
    }
}
