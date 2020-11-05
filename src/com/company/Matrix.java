package com.company;

public class Matrix {

    public static void main(String[] args) {
        int [][] res = new int [2][2];
        int sum = 0;
        int matr [][] = {{2, -3, 1}, {5, 4,- 2}};
        int matr2 [][] = {{-7, 5}, {2, -1}, {4, 3}};

        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                for (int k = 0; k < 3; k++) {
                    sum += matr[i][k] * matr2[k][j];
                }

                res[i][j] = sum;
                sum = 0;
            }
        }

        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
}
