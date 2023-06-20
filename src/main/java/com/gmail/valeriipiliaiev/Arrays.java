package com.gmail.valeriipiliaiev;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        double average = calculateAverage(array);
        System.out.println("Середнє арифметичне: " + average);

        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        boolean isSquare1 = isSquareMatrix(matrix1);
        System.out.println("Чи є матриця квадратною: " + isSquare1);

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
        };
        boolean isSquare2 = isSquareMatrix(matrix2);
        System.out.println("Чи є матриця квадратною: " + isSquare2);
    }

    private static double calculateAverage(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (double) sum / array.length;
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        int rows = matrix.length;
        for (int[] row : matrix) {
            if (row.length != rows) {
                return false;
            }
        }
        return true;
    }
}

