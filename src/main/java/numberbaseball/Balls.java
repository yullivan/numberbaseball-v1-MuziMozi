package numberbaseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    List<Ball> ballList;

    public Balls() {
        ballList = new ArrayList<>();
    }

    void addBall(Ball ball) {
        ballList.add(ball);
    }

    void printBalls(Balls balls) {
        for (Ball ball : balls.ballList) {
            System.out.println(ball.number);
        }
    }
}
