package com.company;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsCount = scanner.nextInt(),
                colsCount = scanner.nextInt();

        if (rowsCount <= 0 || colsCount <= 0) {
            System.out.println("Invalid parameters");
            return;
        }
        System.out.printf("Count of routes", CountOfRoutes(1,1, rowsCount, colsCount));
    }

    static int CountOfRoutes(int xCur, int yCur, final int fieldRows, final int fieldCols)
    {

        if (xCur == fieldCols && yCur == fieldRows)
            return 1;
        if (xCur < fieldCols && yCur < fieldRows)
            return CountOfRoutes(xCur + 2, yCur + 1, fieldRows, fieldCols) + CountOfRoutes(xCur + 1, yCur + 2, fieldRows, fieldCols);
        else return 0;
    }
}
