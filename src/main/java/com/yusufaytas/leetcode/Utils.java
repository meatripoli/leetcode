package com.yusufaytas.leetcode;

public class Utils
{
    static void printMatrix(final int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printMatrix(final char[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int min(final int... numbers)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] < min)
            {
                min = numbers[i];
            }
        }
        return min;
    }

    static int max(final int... numbers)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > max)
            {
                max = numbers[i];
            }
        }
        return max;
    }


}