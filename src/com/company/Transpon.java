package com.company;

public class Transpon {

    public static void main(String[] args) {
        int n = 2;
        int[][] matr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = n * i + j;
            }
        }
        System.out.println("Исходная матрица");
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matr[i][j];
                matr[i][j] = matr[j][i];
                matr[j][i] = temp;
            }
        }

        System.out.println("Транспонированная матрица");
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matr[i][j]);
            }
            System.out.println();
        }

    }
}

