package day_20;

import day_19.Gift;

import java.util.List;

/**
 * Mikołaj chce policzyć, ile metrów kwadratowych papieru prezentowego będzie potrzebował,
 * aby spakować wszystkie prezenty z przygotowanej listy. Wymiary prezentów są podane w centymetrach.
 * Policz, ile metrów kwadratowych papieru prezentowego będzie musiał kupić Mikołaj, aby je spakować.
 */
public class Task {
    public static void main(String[] args) {
        List<Gift> gifts = prepareListOfGifts();

        // TODO: policz ile metrów kwadratowych papieru prezentowego potrzeba,
        //  aby zapakować wszystkie prezenty
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
