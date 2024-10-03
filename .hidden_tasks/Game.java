import java.util.List;
import java.util.ArrayList;

public class Game {
    private ArrayList<Enemy> enemies;
    private Player player;

    public Game() {
        enemies = new ArrayList<>();
        player = new Player();
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void checkInteractions() {
        Iterator<Enemy> iterator = enemies.iterator();
        while (iterator.hasNext()) {
            Enemy enemy = iterator.next();
            if (enemy.interactPlayer(player)) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.addEnemy(new Enemy());
        game.checkInteractions();
    }
}