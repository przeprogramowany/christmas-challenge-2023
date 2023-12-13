package day_14;

import java.util.List;

/**
 * Mikołaj chciałby sprawdzić, kto zmienił zamówiony prezent. Wyświetl na ekranie
 * wszystkie osoby, które zmieniły zamówione prezenty. Zrób to w formacie:
 * "Imię zmienił/a prezent z X na Y".
 */
public class Task {

    private static final String CHILD_UPDATED_GIFT = "%s zmienił/a prezent z %s na %s\n";

    public static void main(String[] args) {
        List<ChildGift> childGifts = prepareListOfChildGifts();

        // TODO - wyświetl osoby, które zamieniły swoje prezenty
    }

    private static List<ChildGift> prepareListOfChildGifts() {
        return List.of(
                new ChildGift("Kamil", "Rower"),
                new ChildGift("Pola", "Piłka", "Książka"),
                new ChildGift("Michał", "Konsola PS5", "Konsola XBOX"),
                new ChildGift("Gosia", "Kostka Rubika"),
                new ChildGift("Wojtek", "Kubek", "Słodycze")
        );
    }
}
