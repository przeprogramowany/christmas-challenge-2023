package day_9;

import java.util.List;

/**
 * Mikołaj ma statystyki dotyczące swoich ostatnich przebytych tras (spalanie na 100 km
 * oraz liczbę przejechanych kilometrów). Na tej podstawie poprosił programistę o napisanie
 * aplikacji, która policzy, ile wydał na paliwo po przebyciu ostatnich tras. Niestety
 * poniższy kod nie został napisany w oparciu o dobre praktyki. Przerefaktoruj kod, który
 * znajdziesz poniżej, aby był jak najbardziej czytelny i był napisany w oparciu o dobre praktyki :)
 * <p>
 * Spalanie z ostatnich tras na 100 km: 10 litrów, 8 litrów, 7 litrów, 11 litrów, 9 litrów
 * Dystans ostatnich tras: 200 km, 700 km, 1550 km, 400 km, 150 km
 * Cena za litr paliwa: 6 zł
 */

public class Solution {

    private static final Double ONE_HUNDRED_KILOMETERS = 100.0;
    private static final Integer FUEL_PRICE = 6;

    public static void main(String[] args) {
        var fuelUsages = List.of(10, 8, 7, 11, 9);
        var traveledDistances = List.of(200, 700, 1550, 400, 150);

        var sumOfTraveledKilometers = getSumOfTraveledKilometers(traveledDistances);
        var fuelUsageAverage = getFuelUsageAverage(fuelUsages);

        var priceForTraveledKilometers = getPriceForTraveledKilometers(
                sumOfTraveledKilometers, fuelUsageAverage);

        System.out.printf("Przejechano %dkm ze średnim spalaniem: %.1fl/100km. " +
                        "Kwota przeznaczona na paliwo: %.1fzł.",
                sumOfTraveledKilometers, fuelUsageAverage, priceForTraveledKilometers);
    }

    private static long getSumOfTraveledKilometers(List<Integer> traveledDistances) {
        return traveledDistances.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static double getFuelUsageAverage(List<Integer> fuelUsages) {
        return fuelUsages.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElseThrow(() -> new IllegalArgumentException("Incorrect values"));
    }

    private static double getPriceForTraveledKilometers(long sumOfTraveledKilometers,
                                                        double fuelUsageAverage) {
        return sumOfTraveledKilometers / ONE_HUNDRED_KILOMETERS * fuelUsageAverage * FUEL_PRICE;
    }
}
