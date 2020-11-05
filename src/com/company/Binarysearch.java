package com.company;

import java.util.Arrays;

public class Binarysearch {
    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 6, 2, 7, 8};

        Arrays.sort(arr);

        int key = 2;
        int res = Arrays.binarySearch(arr, key);

        if (res >= 0)
            System.out.println(key + " true ");
        else
            System.out.println(key + " false");
    }
}
