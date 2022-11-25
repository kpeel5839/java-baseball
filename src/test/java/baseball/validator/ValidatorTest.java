package baseball.validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ValidatorTest {

    private Validator validator;

    @BeforeEach
    void setUp() {
        validator = new Validator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"123", "456"})
    void inputCorrectBalls(String input) {
        // then
        validator.ballsValidate(input); // 예외 발생 x
    }

    @ParameterizedTest
    @ValueSource(strings = {"112", "334", "A", "12a"})
    void inputWrongBalls(String input) {
        assertThatThrownBy(() -> validator.ballsValidate(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2"})
    void inputCorrectGameCommand(String input) {
        validator.gameCommandValidate(input);
    }

    @ParameterizedTest
    @ValueSource(strings = {"3", "a", "asdfk1"})
    void inputWrongGameCommand(String input) {
        assertThatThrownBy(() -> validator.gameCommandValidate(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
