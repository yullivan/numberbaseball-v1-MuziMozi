package numberbaseball;

public class GameResult {
    int strikes;
    int balls;

    public GameResult() {
    }

    public GameResult(int strikes, int balls) {
        this.strikes = strikes;
        this.balls = balls;
    }

    void printResult() {
        if (isOut()) {
            System.out.println("아웃");
        }
        else {
            System.out.println(this.strikes + "스트라이크 / " + this.balls + "볼");
        }
    }

    void incrementCount(BallStatus ballStatus) {
        if (ballStatus == BallStatus.STRIKE) {
            this.strikes++;
        }
        else if (ballStatus == BallStatus.BALL) {
            this.balls++;
        }
    }

    boolean isOut() {
        return this.strikes == 0 && this.balls == 0;
    }

}
