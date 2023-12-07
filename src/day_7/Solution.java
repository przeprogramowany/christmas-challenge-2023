package day_7;

import java.util.List;

/**
 * W systemie Mikołaja wystąpił błąd i wszystkie imiona dzieci zostały odwrócone.
 * Napisz program, który odwróci imiona oraz wypisze je w konsoli dużymi literami.
 */

public class Solution {

    public static void main(String[] args) {
        List<String> names = List.of("alop", "nicram", "ketjow", "mada", "kenaj");

        names.stream()
                .map(name -> new StringBuilder().append(name).reverse().toString())
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
