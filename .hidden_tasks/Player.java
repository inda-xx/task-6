public class Player extends Entity {
    private int score;

    public Player() {
        super();
        score = 0;
    }

    public void updateScore() {
        if (x == 5 && y == 5) {
            score += 10;
        }
    }

    @Override
    public String toString() {
        return "Player[x=" + x + ", y=" + y + ", score=" + score + "]";
    }
}