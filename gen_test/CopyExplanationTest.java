package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CopyExplanationTest {

    @Test
    public void testShallowCopy() {
        int[] shallowArray = {1, 2, 3};
        int[] deepArray = Arrays.copyOf(shallowArray, shallowArray.length);
        shallowArray[0] = 99;

        int[] expectedShallowArray = {99, 2, 3};
        int[] expectedDeepArray = {1, 2, 3};

        assertArrayEquals(expectedShallowArray, shallowArray);
        assertArrayEquals(expectedDeepArray, deepArray);
    }
}

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

