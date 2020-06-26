
package firstLevelTest;

import org.junit.jupiter.api.Test;
import solution.Triangle;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    void calcSquare() {
        assertEquals(0.5, Triangle.calcSquare(new int[]{3,2}, new int[]{7,5}, new int[]{0,0}));
        assertEquals(7, Triangle.calcSquare(new int[]{1,1}, new int[]{2,5}, new int[]{5,3}));
    }
}

