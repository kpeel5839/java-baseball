package baseball.validator;

public class NumberValidator {

    // 여기서는 Number 인지만 확인하면 된다.
    public void validate(String input) {
        for (int index = 0; index < input.length(); index++) {
            char characterOfNowIndex = input.charAt(index);

            if (isNotNumber(characterOfNowIndex)) {
                throw new IllegalArgumentException(); // 나중에 Exception Message 채워넣자
            }
        }
    }

    private boolean isNotNumber(char character) {
        return !('1' <= character && character <= '9');
    }
}
