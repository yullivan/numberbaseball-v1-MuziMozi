package numberbaseball;

import java.util.*;


public class OldApplication {
    // 컴퓨터의 숫자 랜덤 추출 함수
    static List<Integer> pickRandomNumber() {
        List<Integer> randomNumber = new ArrayList<>();
        Random random = new Random();
        while (randomNumber.size() < 3) {
            int num = random.nextInt(9) + 1;
            if (!isDuplicate(randomNumber, num)) {
                randomNumber.add(num);
            }
        }
        return randomNumber;
    }

    // 유저 숫자 받기 함수
    static List<Integer> saveUserNumber() {
        List<Integer> userNumber = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (userNumber.size() < 3) {
            System.out.print("숫자를 입력하세요: ");
            int user = scanner.nextInt();

            if (!isDuplicate(userNumber, user) && isCorrectRange(user)) {
                userNumber.add(user);
            }
            else {
                System.out.println("잘못된 입력! (숫자 중복 불가 & 1부터 9사이의 숫자)");
            }
        }
        return userNumber;
    }

    // 스트라이크 개수 판별 함수
    static int strikeCount(List<Integer> list1, List<Integer> list2) {
        int count = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (Objects.equals(list1.get(i), list2.get(i))) {
                count++;
            }
        }
        return count;
    }

    // 스트라이크 3개 판별 함수
    static boolean isCorrect(int a) {
        return a == 3;
    }

    // 볼 개수 판별 함수
    static int ballCount(List<Integer> list1, List<Integer> list2) {
        int count = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (!Objects.equals(list1.get(i), list2.get(i)) && list1.contains(list2.get(i))) {
                count++;
            }
        }
        return count;
    }

    // 아웃 판별 함수
    static boolean isOut(int strike, int ball) {
        return (strike == 0 && ball == 0);
    }

    // 결과 출력 함수
    static void printResult(int strike, int ball) {
        if (isOut(strike, ball)) {
            System.out.println("아웃!");
        }
        else {
            System.out.println(strike + "스트라이크 / " + ball + "볼");
        }
    }

    /*===========*/
    /*부가 기능 함수*/
    /*===========*/

    // 리스트에 숫자 중복 판별 함수
    static boolean isDuplicate(List<Integer> list, int i) {
        return list.contains(i);
    }

    // 1부터 9 사이의 숫자 판별 함수
    static boolean isCorrectRange(int a) {
        return (a > 0 && a < 10);
    }

    public static void main(String[] args) {
        Ball com = new Ball(1, 2);
        Ball user = new Ball(1, 2);
        System.out.println(com.matchStatus(user));
//        System.out.println("숫자 야구 게임을 시작합니다!");
//        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");
//
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
