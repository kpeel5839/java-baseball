package baseball.validator;

public class GameCommandValidator {

    private final int GAME_COMMAND_SIZE = 1;

    private final NumberValidator numberValidator;

    public GameCommandValidator() {
        numberValidator = new NumberValidator();
    }

    public void validate(String input) {
        numberValidator.validate(input);

        if (isNotOneDigit(input) || isNotOneOrTwo(input)) {
            throw new IllegalArgumentException(); // Add Exception Message Later
        }
    }

    private boolean isNotOneDigit(String input) {
        return input.length() != GAME_COMMAND_SIZE;
    }

    private boolean isNotOneOrTwo(String input) {
        return !(input.equals("1") || input.equals("2"));
    }
}
