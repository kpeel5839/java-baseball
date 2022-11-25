package baseball.validator;

import java.util.HashSet;
import java.util.Set;

public class BallsValidator {

    private final int CORRECT_SIZE = 3;

    private final NumberValidator numberValidator;

    public BallsValidator() {
        numberValidator = new NumberValidator();
    }

    public void validate(String input) {
        numberValidator.validate(input);

        if (isNotThreeDigit(input) || digitIsDuplicate(input)) {
            throw new IllegalArgumentException(); // Add Exception Message Later
        }
    }

    private boolean isNotThreeDigit(String input) {
        return input.length() != CORRECT_SIZE;
    }

    private boolean digitIsDuplicate(String input) {
        Set<Character> overlapChecker = new HashSet<>();
        for (int index = 0; index < input.length(); index++) {
            overlapChecker.add(input.charAt(index));
        }
        return overlapChecker.size() != CORRECT_SIZE;
    }
}
