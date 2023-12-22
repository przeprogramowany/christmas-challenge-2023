package day_23;

import java.util.List;

/**
 * Mikołaj chce wysłać przygotowane prezenty za pomocą Paczkomatu. Ma wymiary skrytki
 * i chciałby wiedzieć czy każdy z podanych prezentów się do niej zmieści (każdy osobno).
 * Znajdź i wypisz w konsoli prezenty, które nie zmieszczą się w skrytce Paczkomatu.
 * Pamiętaj, że każdą paczkę można włożyć do skrytki na różne sposoby :)
 */
public class Task {

    private static final Integer BOX_SIZE_X = 20;
    private static final Integer BOX_SIZE_Y = 30;
    private static final Integer BOX_SIZE_Z = 15;

    public static void main(String[] args) {
        List<Gift> gifts = prepareListOfGifts();

        // TODO: sprawdź czy wszystkie prezenty zmieszczą się do
        //       skrytki o podanych wymiarach. Wypisz w konsoli
        //       te, które się nie zmieszczą
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
