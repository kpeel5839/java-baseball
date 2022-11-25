package baseball.validator;

public class Validator {

    private final BallsValidator ballsValidator;
    private final GameCommandValidator gameCommandValidator;

    public Validator() {
        ballsValidator = new BallsValidator();
        gameCommandValidator = new GameCommandValidator();
    }

    public void ballsValidate(String input) {
        ballsValidator.validate(input);
    }

    public void gameCommandValidate(String input) {
        gameCommandValidator.validate(input);
    }
}
