package numberbaseball;

import java.util.ArrayList;
import java.util.List;

import static numberbaseball.Ball.matchStatus;

public class Balls {
    List<Ball> ballList;
    GameResult gameResult;

    public Balls() {
        ballList = new ArrayList<>();
    }

    void addBall(Ball ball) {
        ballList.add(ball);
    }

    List<String> matchAllBalls(Balls comBalls, Balls userBalls) {
        List<String> resultList = new ArrayList<>();
        for (Ball comball : comBalls.ballList) {
            matchStatus(comball, userBalls.ballList.get(comBalls.ballList.indexOf(comball)));
            resultList.add(matchStatus(comball, userBalls.ballList.get(comBalls.ballList.indexOf(comball))));
        }
        return resultList;
    }

    Boolean isAllStrike(Balls comBalls, Balls userBalls) {
        return comBalls == userBalls;
    }
}
