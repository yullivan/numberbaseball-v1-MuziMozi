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

    boolean isOut() {
        return this.strikes == 0 && this.balls == 0;
    }

    boolean isThreeStrike() {
        return this.strikes == 3;
    }
}
