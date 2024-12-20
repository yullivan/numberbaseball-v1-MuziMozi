package numberbaseball;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static numberbaseball.Application.pickRandomNumber;
import static org.assertj.core.api.Assertions.assertThat;

class OldApplicationTests {

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
		comBalls.addBall(new Ball(1,1));
		comBalls.addBall(new Ball(9,2));
		comBalls.addBall(new Ball(5,3));

		Balls userBalls = new Balls();
		userBalls.addBall(new Ball(1,1));
		userBalls.addBall(new Ball(5,2));
		userBalls.addBall(new Ball(9,3));

		GameResult result = comBalls.calResult(userBalls);
		result.printResult();
	}

	@Test
	void pickRandomNumberTest() {
		for (Ball ball : pickRandomNumber().ballList) {
			System.out.println(ball.number + " " + ball.position);
		}
	}

}
