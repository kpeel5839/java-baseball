package baseball;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class BallsTest {

    @Test
    void 이미_있는_숫자와_겹치는지_확인하는_기능() {
        // given
        Balls balls = new Balls();
        balls.addBall(new Ball(1));

        // then
        assertThat(balls.checkDuplicate(new Ball(1))).isTrue();
        assertThat(balls.checkDuplicate(new Ball(2))).isFalse();
    }

    @Test
    void 세자리_숫자를_만들어주는_기능() {
        // given
        Balls balls = new Balls();
        HashSet<Ball> duplicate = new HashSet<>();

        // when
        balls.generate();
        balls.getBallList().stream().forEach(ball -> duplicate.add(ball));

        //then
        assertThat(balls.getBallList().size()).isEqualTo(3);
        assertThat(balls.getBallList().stream().allMatch((ball) -> 1 <= ball.getNumber() && ball.getNumber() <= 9)).isTrue();
        assertThat(duplicate.size()).isEqualTo(3);
    }
}
