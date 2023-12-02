package day_2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Mikołaj ma przygotowaną listę adresów, pod które musi dostarczyć prezent. Chciałby on
 * skorzystać z pomocy technologii i wyświetlić listę miast, do których musi pojechać.
 * Napisz program, który wyświetli w konsoli nazwy miast bez duplikatów.
 */

public class Solution {
    public static void main(String[] args) {
        List<Address> addresses = prepareListOfAddresses();

        Set<String> sortedAddresses = addresses.stream()
                .map(Address::city)
                .collect(Collectors.toSet());

        System.out.println(sortedAddresses);
    }

    private static List<Address> prepareListOfAddresses() {
        return List.of(
                new Address("Warszawa",
                        "1 maja",
                        25),

                new Address("Wrocław",
                        "Akacjowa",
                        33),

                new Address("Kielce",
                        "Warszawska",
                        16),

                new Address("Warszawa",
                        "Hassa",
                        25),

                new Address("Wrocław",
                        "Altanowa",
                        44),

                new Address("Gdańsk",
                        "Aldony",
                        71),

                new Address("Poznań",
                        "Granitowa",
                        36)
        );
    }
}