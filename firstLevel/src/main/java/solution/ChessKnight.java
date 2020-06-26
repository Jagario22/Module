package solution;

public class ChessKnight {

    public static boolean checkStep(int[]currentPosition, int[] coordinates) {
        int Y = Math.abs(currentPosition[0] - coordinates[0]);
        int X = Math.abs(currentPosition[1] - coordinates[1]);

        return (Y == 1 && X == 2) || (Y == 2 && X == 1);
    }
}
