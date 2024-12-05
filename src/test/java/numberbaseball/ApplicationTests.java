package numberbaseball;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static numberbaseball.Ball.matchStatus;
import static numberbaseball.GameResult.printResult;
import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTests {

	@Test
	void matchStatusTest() {
		assertThat(matchStatus(new Ball(1,2), new Ball(1, 2))).isEqualTo("STRIKE");
		assertThat(matchStatus(new Ball(1,2), new Ball(1, 1))).isEqualTo("BALL");
		assertThat(matchStatus(new Ball(1,2), new Ball(2, 2))).isEqualTo("NOTHING");
	}

	@Test
	void calResultTest() {
		Balls comBalls = new Balls();
		comBalls.addBall(new Ball(1,2));
		comBalls.addBall(new Ball(9,1));
		comBalls.addBall(new Ball(5,3));

		Balls userBalls = new Balls();
		userBalls.addBall(new Ball(2,1));
		userBalls.addBall(new Ball(3,2));
		userBalls.addBall(new Ball(4,3));

		GameResult result = new GameResult();
		result = userBalls.calResult(comBalls, userBalls);
		printResult(result);
	}

}
