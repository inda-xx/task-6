package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void testScoreDefaultZero() {
        Player player = new Player();
        assertEquals(0, player.score);
    }

    @Test
    public void testUpdateScore() {
        Player player = new Player();
        player.x = 5;
        player.y = 5;
        player.updateScore();
        assertEquals(10, player.score);
    }

    @Test
    public void testToString() {
        Player player = new Player();
        String expected = "Player[x=0, y=0, score=0]";
        assertEquals(expected, player.toString());
    }
}

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

