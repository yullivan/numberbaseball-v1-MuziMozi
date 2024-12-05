package numberbaseball;

import java.util.ArrayList;
import java.util.List;

import static numberbaseball.Ball.matchStatus;

public class Balls {
    List<Ball> ballList;

    public Balls() {
        ballList = new ArrayList<>();
    }

    void addBall(Ball ball) {
        ballList.add(ball);
    }

    GameResult calResult(Balls comBalls, Balls userBalls) {
        int strikes = 0;
        int balls = 0;
        for (Ball comball : comBalls.ballList) {
            if (matchStatus(comball, userBalls.ballList.get(comBalls.ballList.indexOf(comball))).equals("STRIKE")) {
                strikes++;
            }
            else if (matchStatus(comball, userBalls.ballList.get(comBalls.ballList.indexOf(comball))).equals("BALL")) {
                balls++;
            }

        }
        return new GameResult(strikes, balls);
    }
}
