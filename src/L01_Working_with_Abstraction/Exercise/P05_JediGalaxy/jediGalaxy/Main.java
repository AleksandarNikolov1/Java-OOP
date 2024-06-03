package L01_Working_with_Abstraction.Exercise.P05_JediGalaxy.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String matrixSize = sc.nextLine();

        int[] rowsAndCols = readArray(matrixSize);
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = readMatrix(rows, cols);

        long ivoCollectedCells = 0;

        String ivoInput = sc.nextLine();

        while (!ivoInput.equals("Let the Force be with you")) {

            String evilInput = sc.nextLine();

            int[] ivoPosition = readArray(ivoInput);
            int ivoRow = ivoPosition[0];
            int ivoCol = ivoPosition[1];

            int[] evilPosition = readArray(evilInput);
            int evilRow = evilPosition[0];
            int evilCol = evilPosition[1];

            evilMove(matrix, evilRow, evilCol);
            ivoCollectedCells += ivoMove(matrix, ivoRow, ivoCol);


            ivoInput = sc.nextLine();

        }

        System.out.println(ivoCollectedCells);
    }

    private static int[] readArray(String input) {
        return Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }

    private static int[][] readMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        int num = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = num++;
            }
        }

        return matrix;
    }

    private static void evilMove(int[][] matrix, int row, int col) {
        row -= 1;
        col -= 1;

        while (row >= 0 && col >= 0) {
            matrix[row][col] = 0;

            row--;
            col--;
        }
    }

    private static long ivoMove(int[][] matrix, int row, int col) {
        row -= 1;
        col += 1;

        long sum = 0;
        while (row >= 0 && col < matrix[row].length) {
            sum += matrix[row][col];
            row--;
            col++;
        }
        return sum;
    }
}
