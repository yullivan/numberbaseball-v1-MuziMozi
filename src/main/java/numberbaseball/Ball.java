package numberbaseball;

public class Ball {
    int number;
    int position;

    public Ball(int number, int position) {
        this.number = number;
        this.position = position;
    }

    public BallStatus matchStatus(Ball userBall) {
        if (isStrike(userBall)) {
            return BallStatus.STRIKE;
        }
        else if (isBall(userBall)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    boolean isStrike(Ball userBall) {
        return this.number == userBall.number && this.position == userBall.position;
    }

    boolean isBall(Ball userBall) {
        return this.number == userBall.number && this.position != userBall.position;
    }

}
