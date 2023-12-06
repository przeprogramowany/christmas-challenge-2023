package day_6;

import java.util.*;

/**
 * Grupa znajomych chce zrobić losowanie prezentów na święta. Napisz program, który dla każdej
 * osoby wylosuje, komu kupuje prezent. Pamiętaj, że każda z osób może zostać wylosowana tylko raz!
 */

public class Solution {

    public static void main(String[] args) {
        Map<Integer, String> names = new LinkedHashMap<>();
        names.put(1, "Mikołaj");
        names.put(2, "Gosia");
        names.put(3, "Adam");
        names.put(4, "Pola");
        names.put(5, "Wojtek");

        List<Integer> generatedPersonIds = new ArrayList<>();

        for (int currentPersonId = 0; currentPersonId < names.size(); currentPersonId++) {
            List<Integer> numbersToGenerate = new ArrayList<>(names.keySet());
            numbersToGenerate.remove(currentPersonId);
            numbersToGenerate.removeAll(generatedPersonIds);

            int generatedPersonId = getNumberOfRandomPerson(numbersToGenerate);
            generatedPersonIds.add(generatedPersonId);

            System.out.println(String.format("%s kupuje prezent dla: %s",
                    names.get(currentPersonId + 1),
                    names.get(generatedPersonId)));
        }
    }

    private static int getNumberOfRandomPerson(List<Integer> numbersToGenerate) {
        int randomPerson = new Random().nextInt(numbersToGenerate.size());
        return numbersToGenerate.get(randomPerson);
    }
}
