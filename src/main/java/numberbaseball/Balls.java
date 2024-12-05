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

    void printBalls() {
        for (Ball ball : this.ballList) {
            System.out.println("숫자: " + ball.number + " 자리: " + ball.position);
        }
    }

    GameResult calResult(Balls userBalls) {
        int strikes = 0;
        int balls = 0;
        for (Ball comball : this.ballList) {
            if (comball.matchStatus(userBalls.ballList.get(this.ballList.indexOf(comball))) == BallStatus.STRIKE) {
                strikes++;
            }
            else if (comball.matchStatus(userBalls.ballList.get(this.ballList.indexOf(comball))) == BallStatus.BALL) {
                balls++;
            }
        }
        return new GameResult(strikes, balls);
    }
}
