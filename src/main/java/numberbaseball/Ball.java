package numberbaseball;

public class Ball {
    int number;
    int position;

    public Ball(int number, int position) {
        this.number = number;
        this.position = position;
    }

    static String matchStatus(Ball com, Ball user) {
        if (isStrike(com, user)) {
            return "STRIKE";
        }
        else if (isBall(com, user)) {
            return "BALL";
        }
        return "NOTHING";
    }

    static Boolean isStrike(Ball com, Ball user) {
        return com.number == user.number && com.position == user.position;
    }

    static Boolean isBall(Ball com, Ball user) {
        return com.number == user.number && com.position != user.position;
    }

}
