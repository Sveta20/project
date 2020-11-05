package com.company;

import java.util.Arrays;

public class Quiksort2 {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int p = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < p) {
                i++;
            }

            while (array[j] > p) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {
        int[] x =  {3, 5, 2, 6, 2, 7, 8};
        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println(Arrays.toString(x));
    }
}