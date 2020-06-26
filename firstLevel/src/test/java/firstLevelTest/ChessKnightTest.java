package firstLevelTest;
import solution.ChessKnight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChessKnightTest {

    @Test
    void checkStep() {
        assertTrue(ChessKnight.checkStep(new int[]{4, 5}, new int[]{6, 4}));
        assertTrue(ChessKnight.checkStep(new int[]{4, 5}, new int[]{6, 6}));
        assertTrue(ChessKnight.checkStep(new int[]{4, 5}, new int[]{5, 7}));
        assertTrue(ChessKnight.checkStep(new int[]{4, 5}, new int[]{3, 7}));
        assertTrue(ChessKnight.checkStep(new int[]{4, 5}, new int[]{2, 6}));
        assertTrue(ChessKnight.checkStep(new int[]{4, 5}, new int[]{2, 4}));
        assertTrue(ChessKnight.checkStep(new int[]{4, 5}, new int[]{3, 3}));
        assertTrue(ChessKnight.checkStep(new int[]{4, 5}, new int[]{5, 3}));
    }
}
