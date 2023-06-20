package com.gmail.valeriipiliaiev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ArraysTest {
    @Test
    public void testIsSquareMatrix() {
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertTrue(Arrays.isSquareMatrix(squareMatrix));

        int[][] nonSquareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
        };
        Assertions.assertFalse(Arrays.isSquareMatrix(nonSquareMatrix));
    }
}