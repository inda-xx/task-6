package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TernaryOperatorExplanationTest {

    @Test
    public void testNumberIsOddUsingIfElse() {
        int number = 5;
        String resultIfElse;
        if (number % 2 == 0) {
            resultIfElse = "Even";
        } else {
            resultIfElse = "Odd";
        }
        assertEquals("Odd", resultIfElse);
    }

    @Test
    public void testNumberIsOddUsingTernaryOperator() {
        int number = 5;
        String resultTernary = (number % 2 == 0) ? "Even" : "Odd";
        assertEquals("Odd", resultTernary);
    }
}

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;

