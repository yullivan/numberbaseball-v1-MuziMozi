package numberbaseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {
    // 컴퓨터의 숫자 랜덤 추출 함수
    static List<Integer> pickRandomNumber() {
        List<Integer> randomNumber = new ArrayList<>();
        while (randomNumber.size() < 3) {
            Random random = new Random();
            int num = random.nextInt(9) + 1;
            if (!isDuplicate(randomNumber, num)) {
                randomNumber.add(num);
            }
        }
        return randomNumber;
    }

    // 리스트에 숫자 중복 판별 함수
    static boolean isDuplicate(List<Integer> list, int i) {
        return list.contains(i);
    }

    // 유저 숫자 받기 함수
    static List<Integer> saveUserNumber() {
        List<Integer> userNumber = new ArrayList<>();
        while (userNumber.size() < 3) {
            Scanner scanner = new Scanner(System.in);
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

    // 1부터 9 사이의 숫자 판별 함수
    static boolean isCorrectRange(int a) {
        return (a > 0 && a < 10);
    }

    public static void main(String[] args) {
        System.out.println(saveUserNumber());
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("숫자 야구 게임을 시작합니다!");
//        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");
//
//        while (true) {
//            // 사용자 입력 받기 (이 부분은 완성되어 있음)
//            System.out.print("\n첫 번째 숫자를 입력하세요: ");
//            int user1 = scanner.nextInt();
//            System.out.print("두 번째 숫자를 입력하세요: ");
//            int user2 = scanner.nextInt();
//            System.out.print("세 번째 숫자를 입력하세요: ");
//            int user3 = scanner.nextInt();
//
//            // TODO: strike 개수를 계산하세요
//
//
//            // TODO: 결과를 출력하세요 (예: "1 스트라이크")
//
//
//            // TODO: 3 스트라이크인 경우 게임을 끝내세요
//
//
//        }
//
//        // System.out.println("축하합니다! 정답을 맞추셨습니다.");
    }

}
