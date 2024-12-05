package numberbaseball;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static numberbaseball.GameResult.printResult;
import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTests {

	@Test
	void matchStatusTest() {
		Ball comBall = new Ball(1,2);
		assertThat(comBall.matchStatus(new Ball(1, 2))).isEqualTo("STRIKE");
		assertThat(comBall.matchStatus(new Ball(1, 1))).isEqualTo("BALL");
		assertThat(comBall.matchStatus(new Ball(2, 2))).isEqualTo("NOTHING");
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

		GameResult result = comBalls.calResult(userBalls);
		printResult(result);
	}

}
