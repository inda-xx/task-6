package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EntityTest {

    @Test
    public void testDefaultPosition() {
        Entity entity = new Entity();
        assertEquals(0, entity.x);
        assertEquals(0, entity.y);
    }

    @Test
    public void testMoveUpdatesPosition() {
        Entity entity = new Entity();
        Random random = new Random(1);
        entity.move(random);

        assertTrue(entity.x == 0 || entity.x == -1 || entity.x == 1);
        assertTrue(entity.y == 0 || entity.y == -1 || entity.y == 1);
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

