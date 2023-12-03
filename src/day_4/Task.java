package day_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Mikołaj otrzymał listę prezentów do kupienia przed świętami. Niestety podczas
 * wpisywania nazwy prezentu nie było żadnej walidacji i zawierają one błędy
 * (przykładowo nadmierne puste znaki lub brak wartości). Wypisz listę prezentów
 * po przecinku. Pomiń puste wartości i usuń zbędne odstępy.
 */

public class Task {

    public static void main(String[] args) {
        List<String> listOfPresents = getListOfPresents();

        // TODO: wypisz listę prezentów po przecinku - pomiń
        //  puste wartości i usuń zbędne odstępy
    }

    private static List<String> getListOfPresents() {
        List<String> presents = new ArrayList<>();

        presents.add("Klocki LEGO   ");
        presents.add("Lalka Barbie");
        presents.add(" ");
        presents.add("  Samochód zdalnie sterowany");
        presents.add("Rower  ");
        presents.add(null);
        presents.add("   Kostka Rubika");
        presents.add("Myszka do komputera    ");

        return presents;
    }
}