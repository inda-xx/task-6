package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testAddEnemy() {
        Game game = new Game();
        Enemy enemy = new Enemy();
        game.addEnemy(enemy);
        assertEquals(1, game.enemies.size());
        assertTrue(game.enemies.contains(enemy));
    }

    @Test
    public void testCheckInteractionsRemovesEnemy() {
        Game game = new Game();
        Player player = game.player;
        Enemy enemy = new Enemy();

        enemy.x = player.x;
        enemy.y = player.y;
        game.addEnemy(enemy);

        game.checkInteractions();
        assertEquals(0, game.enemies.size());
    }
}