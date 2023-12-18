package day_19;

import java.util.List;

/**
 * Gwiazdka pakuje wszystkie prezenty świąteczne do dużego pudełka w celu ich przetransportowania.
 * Duże pudełko ma objętość 300 jednostek. Policz ile pudełek potrzebuje Gwiazdka, aby przetransportować
 * wszystkie prezenty z poniższej listy.
 */
public class Task {

    private static final Double BOX_VOLUME = 300.0;

    public static void main(String[] args) {
        List<Gift> gifts = prepareListOfGifts();

        // TODO: policz ile pudełek potrzebuje Gwiazdka, aby zapakować wszystkie prezenty z listy

        System.out.print("Gwiazdka potrzebuje ... pudełek/ka, aby zapakować wszystkie prezenty");
    }

    private static List<Gift> prepareListOfGifts() {
        return List.of(
                new Gift("Piłka", 2, 2, 2),
                new Gift("Komputer", 5, 4, 4),
                new Gift("Samochód zdalnie sterowany", 2, 2, 2),
                new Gift("Rower", 8, 6, 4),
                new Gift("Ekspres do kawy", 4, 4, 4)
        );
    }
}
