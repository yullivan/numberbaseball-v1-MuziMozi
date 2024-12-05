package numberbaseball;

import java.util.*;

public class Application {
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

    /*===========*/
    /*부가 기능 함수*/
    /*===========*/

    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");

        Balls computerBalls = pickRandomNumber();

//        List<Integer> computerNum = pickRandomNumber();
//        System.out.println(computerNum);
//        List<Integer> userNum = saveUserNumber();
//
//        // TODO: strike 개수를 계산하세요
//        int strike = strikeCount(computerNum, userNum);
//        int ball = ballCount(computerNum, userNum);
//
//        // TODO: 결과를 출력하세요 (예: "1 스트라이크")
//        printResult(strike, ball);
//
//        // TODO: 3 스트라이크인 경우 게임을 끝내세요
//        while (!isCorrect(strike)) {
//            userNum = saveUserNumber();
//            strike = strikeCount(computerNum, userNum);
//            ball = ballCount(computerNum, userNum);
//            printResult(strike, ball);
//        }
//        System.out.println("축하합니다! 정답을 맞히셨습니다.");
    }
}
