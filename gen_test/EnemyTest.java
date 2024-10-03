package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnemyTest {

    @Test
    public void testEnemyInteractionRemovesEnemy() {
        Player player = new Player();
        Enemy enemy = new Enemy();
        enemy.x = player.x;
        enemy.y = player.y;

        assertTrue(enemy.interactPlayer(player));
    }

    @Test
    public void testEnemyNoInteraction() {
        Player player = new Player();
        Enemy enemy = new Enemy();
        enemy.x = player.x + 1;
        enemy.y = player.y + 1;

        assertFalse(enemy.interactPlayer(player));
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;

