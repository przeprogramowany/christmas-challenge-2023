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

public class Task {

    public static void main(String[] args) {
        int p = 6;
        List<Integer> s = List.of(10, 8, 7, 11, 9);
        List<Integer> d = List.of(200, 700, 1550, 400, 150);

        int a = (s.get(0) + s.get(1) + s.get(2) + s.get(3) + s.get(4)) / 5;

        int b = d.get(0) + d.get(1) + d.get(2) + d.get(3) + d.get(4);

        int sum = b / 100 * a * p;

        System.out.println(sum);
    }
}
