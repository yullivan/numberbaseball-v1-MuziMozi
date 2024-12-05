package numberbaseball;

import java.util.*;

public class Application {

    // 컴퓨터의 랜덤한 공 3개 생성 메서드
    static Balls pickRandomNumber() {
        Balls comBalls = new Balls();
        Random random = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();
        int position = 1;

        while (uniqueNumbers.size() < 3) {
            int num = random.nextInt(9) + 1;
            if (uniqueNumbers.add(num)) { // 중복이 아니면 추가
                Ball ball = new Ball(num, position++);
                comBalls.addBall(ball);
            }
        }

        return comBalls;
    }

    // 유저 숫자 받기 메서드
    static Balls saveUserNumber() {
        Balls userBalls = new Balls();
        Set<Integer> uniqueNumbers = new HashSet<>();
        int position = 1;

        Scanner scanner = new Scanner(System.in);
        while (userBalls.ballList.size() < 3) {
            System.out.print("숫자를 입력하세요: ");
            int userNum = scanner.nextInt();

            if (isCorrectRange(userNum) && uniqueNumbers.add(userNum)) { // 중복이 아니면 추가
                Ball ball = new Ball(userNum, position++);
                userBalls.addBall(ball);
            }
            else {
                System.out.println("잘못된 입력! (숫자 중복 불가, 1부터 9까지의 정수)");
            }
        }
        return userBalls;
    }

    // 3 스트라이크 판별 메서드
    final static int THREE_STRIKE = 3;
    static boolean isThreeStrike(GameResult gameResult) {
        return gameResult.strikes == THREE_STRIKE;
    }

    // 유저가 입력한 숫자가 1 ~ 9까지의 정수인지 판별하는 메서드
    static boolean isCorrectRange(int i) {
        return i > 0 && i < 10;
    }
    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");

        Balls computerBalls = pickRandomNumber();
        computerBalls.printBalls();

        Balls userBalls = saveUserNumber();

        // TODO: strike 개수를 계산하세요
        GameResult result = computerBalls.calResult(userBalls);

        // TODO: 결과를 출력하세요 (예: "1 스트라이크")
        result.printResult();

        // TODO: 3 스트라이크인 경우 게임을 끝내세요
        while (!isThreeStrike(result)) {
            userBalls = saveUserNumber();
            result = computerBalls.calResult(userBalls);
            result.printResult();
        }
        System.out.println("축하합니다! 정답을 맞히셨습니다.");
    }
}
