package firstLevelTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import solution.ArrayOperation;

public class ArrayOperationTest {

    @Test
    void countUniqueNumbers() {
        assertEquals(4, ArrayOperation.countUniqueNumbers(new int[]{1, 4, 5, 1, 1, 3}));
    }
}
