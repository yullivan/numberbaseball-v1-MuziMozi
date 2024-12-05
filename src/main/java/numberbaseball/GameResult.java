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

    static void printResult(GameResult result) {
        System.out.println(result.strikes + "스트라이크 / " + result.balls + "볼");
    }
}
