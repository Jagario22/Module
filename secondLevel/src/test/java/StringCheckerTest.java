
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import solution.StringChecker;


public class StringCheckerTest {

    @Test
    void isRightString() {
        assertTrue(StringChecker.isRightString("(hello)"));
        assertTrue(StringChecker.isRightString("(hello)((hi))"));
        assertFalse(StringChecker.isRightString("(hello)hi)"));
        assertFalse(StringChecker.isRightString("(hello){hi)"));
        assertTrue(StringChecker.isRightString("(hello)({hi})"));
        assertFalse(StringChecker.isRightString("(hello(){hi)}"));
        assertTrue(StringChecker.isRightString(""));
    }
}
