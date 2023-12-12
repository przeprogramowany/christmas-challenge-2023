package day_13;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Mikołaj w formularzu do zamawiania prezentów dodał pole do wpisywania numeru
 * telefonu rodzica. Chciałby dodać walidację formatu, ale nie potrafi sam tego
 * zrobić. Napisz regex, który sprawdzi, czy numer został podany w jednym z formatów:
 * - +48 123-456-789
 * - 123-456-789
 * Jeśli regex będzie prawidłowy, działanie programu zakończy się bez błędu.
 */
public class Task {

    private static final String PHONE_NUMBER_REGEX = ""; // TODO
    private static final Pattern PHONE_NUMBER_PATTERN = Pattern.compile(PHONE_NUMBER_REGEX);

    public static void main(String[] args) {
        List<String> phoneNumbers = List.of("+48 123-456-789", "123-456-789");

        boolean arePhoneNumbersValid = phoneNumbers.stream().allMatch(Task::isPhoneNumberValid);

        if (!arePhoneNumbersValid) {
            throw new IllegalArgumentException("Invalid phone numbers");
        }
    }

    private static boolean isPhoneNumberValid(String phoneNumber) {
        Matcher matcher = PHONE_NUMBER_PATTERN.matcher(phoneNumber);
        return matcher.matches();
    }
}
