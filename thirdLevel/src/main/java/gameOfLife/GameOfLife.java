package gameOfLife;

public class GameOfLife {

    public static int[][] go(int[][] field) {
        if (field.length < 3 || field[0].length < 3) {
            return field;
        }
        return generateNewLife(field);
    }

    private static int[][] generateNewLife(int[][] field) {
        int[][] newGen = new int[field.length][field[0].length];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                newGen[i][j] = checkRules(field, i, j);
            }
        }
        return newGen;
    }

    private static int checkRules(int[][] field, int i, int j) {
        int lifeCount = adjacentCells(field, i, j);
        int result = field[i][j];

        if (lifeCount < 2 || lifeCount > 3)
            result = 0;
        else if (lifeCount == 3 && result == 0)
            result = 1;

        return result;
    }

    private static int adjacentCells(int[][] field, int i, int j) {
        int result = 0;
        boolean upperLeftCorner = i == 0 && j == 0;
        boolean upperRightCorner = i == 0 && j == field[0].length - 1;
        boolean bottomLeftCorner = i == field.length - 1 && j == 0;
        boolean bottomRightCorner = i == field.length - 1 && j == field[0].length - 1;


        if (upperLeftCorner) {
            result += field[field.length - 1][field[0].length - 1] + field[i][field.length - 1] + field[i + 1][field[0].length - 1]
                    + field[field.length - 1][j] + field[i + 1][j] + field[field.length - 1][j + 1] + field[i][j + 1] + field[i + 1][j + 1];
        } else if (upperRightCorner) {
            result += field[field.length - 1][j - 1] + field[i][j - 1] + field[i + 1][j - 1] + field[field.length - 1][j] + field[i + 1][j]
                    + field[field.length - 1][0] + field[i][0] + field[i + 1][0];
        } else if (bottomLeftCorner) {
            result += field[i - 1][field[0].length - 1] + field[i][field[0].length - 1] + field[0][field[0].length - 1]
                    + field[i - 1][j] + field[0][j] + field[i - 1][j + 1] + field[i][j + 1] + field[0][j + 1];
        } else if (bottomRightCorner) {
            result += field[i - 1][j - 1] + field[i][j - 1] + field[0][j - 1] + field[i - 1][j] + field[0][j] + field[i - 1][0]
                    + field[i][0] + field[0][0];
        } else if (i == 0) {
            result += field[field.length - 1][j - 1] + field[field.length - 1][j] + field[field.length - 1][j + 1]
                    + field[i][j - 1] + field[i][j + 1] + field[i + 1][j - 1] + field[i + 1][j] + field[i + 1][j + 1];
        } else if (i == field.length - 1) {
            result += field[0][j - 1] + field[0][j] + field[0][j + 1]
                    + field[i - 1][j - 1] + field[i - 1][j] + field[i - 1][j + 1] + field[i][j - 1] + field[i][j + 1];
        } else if (j == 0) {
            result += field[i-1][field[0].length -1] + field[i][field[0].length - 1] + field[i+1][field[0].length - 1]
                    + field[i+1][j] + field[i-1][j] + field[i+1][j+1] + field[i][j+1] + field[i-1][j+1];
        } else if (j == field[0].length - 1) {
            result += field[i-1][0] +field[i][0] + field[i+1][0] + field[i-1][j] + field[i+1][j] + field[i-1][j-1]
                    + field[i][j-1] + field[i+1][j-1];
        } else {
            result += field[i-1][j-1] + field[i][j-1] + field[i+1][j-1] + field[i-1][j] + field[i+1][j] + field[i+1][j+1]
                    + field[i][j+1] + field[i-1][j+1];
        }

        return result;
    }
}



/*
if (i == 0 && j == 0) {
        result +=
        } else if (i == 0 && j == field[0].length - 1) {
        result += field[i][j - 1] + field[i + 1][j] + field[i + 1][j - 1];
        } else if (i == 0) {
        result += field[i][j - 1] + field[i][j + 1] + field[i + 1][j]
        + field[i + 1][j + 1] + field[i + 1][j - 1];
        } else if (j == 0 && i == field.length - 1) {
        result += field[i - 1][j] + field[i][j + 1] + field[i - 1][j + 1];
        } else if (j == field[0].length - 1 && i == field.length - 1) {
        result += field[i - 1][j] + field[i][j - 1] + field[i - 1][j - 1];
        } else if (j == field[0].length - 1) {
        result += field[i + 1][j] + field[i - 1][j] + field[i + 1][j - 1] + field[i][j - 1] + field[i - 1][j - 1];
        } else if (j == 0) {
        result += field[i+1][j] + field[i-1][j] + field[i+1][j+1] + field[i][j+1] + field[i-1][j+1];
        } else if (i == field.length - 1) {
        result += field[i][j+1] + field[i][j-1] + field[i-1][j-1] + field[i-1][j] + field[i-1][j+1];
        } else {
        result += field[i][j + 1] + field[i][j - 1] + field[i - 1][j + 1] + field[i - 1][j - 1] + field[i - 1][j] + field[i + 1][j + 1] + field[i + 1][j - 1] + field[i + 1][j];
        }*/
