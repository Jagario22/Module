import static org.junit.jupiter.api.Assertions.*;

import gameOfLife.GameOfLife;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GameOfLifeTest {

    @Test
    void go() {
        int[][] arr = {{0, 1, 0},
                       {1, 0, 1},
                       {0, 0, 0}};

        int[][] result = {{1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}};

        int[][] newGen = GameOfLife.go(arr);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                assertEquals(result[i][j], newGen[i][j]);
            }
        }


        int[][] arr2 = {{0, 1, 1, 0, 1},
                {0, 0, 1, 0, 0},
                {1, 0, 1, 0, 0}};

        int[][] result2 = {{1, 0, 1, 0, 0},
                {1, 0, 1, 0, 0},
                {1, 0, 1, 0, 0}};

        int[][] newGen2 = GameOfLife.go(arr2);
        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2[0].length; j++) {
                assertEquals(result2[i][j], newGen2[i][j]);
            }
        }

    }
}
