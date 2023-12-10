package day_10;

import java.util.Random;
import java.util.Scanner;

/**
 * Mikołaj w jednym z listów znalazł prośbę o grę w zgadywanie liczb. Napisz program,
 * który wylosuję liczbę w przedziale 0 - 99 i pozwoli użytkownikowi wpisywać wartości
 * do czasu, aż wylosowana liczba zostanie zgadnięta.
 * - Jeśli podana liczba będzie zbyt mała lub zbyt duża, wyświetl o tym informację.
 * - Jeśli użytkownik zgadnie liczbę, wyświetl odpowiedni komunikat oraz zakończ grę.
 * <p>
 * Jeśli chcesz to możesz dodać dodatkowe walidacje (np. sprawdzenie czy została
 * podana liczba, a nie np. ciąg znaków lub znak specjalny).
 */

public class Solution {

    private static final Integer RANGE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectedValue = new Random().nextInt(RANGE);
        System.out.println("Znaleziono liczbę do zgadnięcia w przedziale 0 - 99\n");

        for (; ; ) {
            System.out.println("Zgadnij jaka liczba została wylosowana:");
            if (scanner.hasNextInt()) {
                int checkingValue = scanner.nextInt();

                if (checkingValue == expectedValue) {
                    System.out.println("Wygrał*ś, brawo!");
                    break;
                } else if (checkingValue > expectedValue) {
                    System.err.println("Za duża wartość :(\n");
                } else {
                    System.err.println("Za mała wartość :(\n");
                }
            } else {
                System.err.println("Nieprawidłowa wartość :( Musisz podać liczbę\n");
                scanner.next();
            }
        }
    }
}
