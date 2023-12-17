package day_16;

import java.util.List;

/**
 * Mikołaj zakodował wiadomość w kodzie ASCII. Zamień liczby na litery
 * i odczytaj hasło, które jest ukryte pod 'SANTA_MESSAGE'.
 */
public class Solution {

    private static final List<Integer> SANTA_MESSAGE = List.of(87, 101,
            115, 111, 108, 121, 99, 104, 32, 83, 119, 105, 97, 116, 33);

    public static void main(String[] args) {
        SANTA_MESSAGE.stream()
                .map(Character::toString)
                .forEach(System.out::print);
    }
}
