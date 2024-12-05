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
        if (isOut(result)) {
            System.out.println("아웃");
        }
        else {
            System.out.println(result.strikes + "스트라이크 / " + result.balls + "볼");
        }
    }

    static boolean isOut(GameResult result) {
        return result.strikes == 0 && result.balls == 0;
    }
}
