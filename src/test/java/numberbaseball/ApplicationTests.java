package numberbaseball;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static numberbaseball.Ball.matchStatus;

class ApplicationTests {

	@Test
	void matchStatusTest() {
		Ball com = new Ball(1, 2);
		Ball user = new Ball(1, 2);
		System.out.println(matchStatus(com, user));
	}

}
