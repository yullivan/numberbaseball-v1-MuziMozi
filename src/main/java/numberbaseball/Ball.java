package numberbaseball;

public class Ball {
    int number;
    int position;

    public Ball(int number, int position) {
        this.number = number;
        this.position = position;
    }

    public String matchStatus(Ball userBall) {
        if (isStrike(userBall)) {
            return "STRIKE";
        }
        if (isBall(userBall)) {
            return "BALL";
        }
        return "NOTHING";
    }

    boolean isStrike(Ball userBall) {
        return this.number == userBall.number && this.position == userBall.position;
    }

    boolean isBall(Ball userBall) {
        return this.number == userBall.number && this.position != userBall.position;
    }

}
