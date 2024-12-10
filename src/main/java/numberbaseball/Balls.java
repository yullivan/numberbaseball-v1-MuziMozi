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
        GameResult gameResult = new GameResult(0, 0);

        for (Ball comBall : this.ballList) {
            for (Ball userBall : userBalls.ballList) {
                // 볼 상태 비교는 어차피 GameResult의 incrementCount 메서드가 하기 때문에
                // 굳이 이 안에서 조건문을 쓸 필요없이 그때 그때 결과값만 GameResult에게 전달해주면 됨.
//                if (comBall.matchStatus(userBall) == BallStatus.STRIKE) {
//                    gameResult.incrementCount(BallStatus.STRIKE);
//                }
//                if (comBall.matchStatus(userBall) == BallStatus.BALL) {
//                    gameResult.incrementCount(BallStatus.BALL);
//                }
                gameResult.incrementCount(comBall.matchStatus(userBall));
            }
        }
        return gameResult;
    }
}
