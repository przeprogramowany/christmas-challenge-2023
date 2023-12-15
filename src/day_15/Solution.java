package day_15;

/**
 * Mikołaj zaszyfrował wiadomość, która znajduje się w 'SANTA_MESSAGE'.
 * Napisz program, który usunie wszystkie małe litery, aby ją odszyfrować.
 */
public class Solution {

    private static final String SANTA_MESSAGE = """
            alqMlefEqweRdzdsRqqweYsd wqdCqwqwdHzxcvRbfdbdIfwefSweTfewMwefAwefSqwe!
            """;

    public static void main(String[] args) {
        String decodedMessage = SANTA_MESSAGE.replaceAll("[a-z]", "");
        System.out.println(decodedMessage);
    }
}
