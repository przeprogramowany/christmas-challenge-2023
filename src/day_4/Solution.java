package day_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Mikołaj otrzymał listę prezentów do kupienia przed świętami. Niestety podczas
 * wpisywania nazwy prezentu nie było żadnej walidacji i zawierają one błędy
 * (przykładowo nadmierne puste znaki lub brak wartości). Wypisz listę prezentów
 * po przecinku. Pomiń puste wartości i usuń zbędne odstępy.
 */

public class Solution {

    private static final String COMMA = ", ";

    public static void main(String[] args) {
        List<String> listOfPresents = getListOfPresents();

        String presents = listOfPresents.stream()
                .filter(Objects::nonNull)
                .map(String::trim)
                .filter(present -> !present.isEmpty())
                .collect(Collectors.joining(COMMA));

        System.out.println(presents);
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