package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomExplanationTest {

    @Test
    public void testRandomIntGeneratesDifferentValues() {
        Random random1 = new Random();
        Random random2 = new Random();
        int randomInt1 = random1.nextInt();
        int randomInt2 = random2.nextInt();
        assertNotEquals(randomInt1, randomInt2);
    }

    @Test
    public void testBoundedRandomInt() {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int boundedInt = random.nextInt(10);
            assertTrue(boundedInt >= 0 && boundedInt < 10);
        }
    }

    @Test
    public void testRandomDoubleGeneratesValuesBetweenZeroAndOne() {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            double randomDouble = random.nextDouble();
            assertTrue(randomDouble >= 0.0 && randomDouble < 1.0);
        }
    }
}

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import java.util.Random;
import java.util.Iterator;

