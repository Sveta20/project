package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SBS {
    public static void main(String args[]) {
        int counter, num, item, array[], first, last;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        num = input.nextInt();

        array = new int[num];
        System.out.println("Введите " + num + " чисел");

        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();

        Arrays.sort(array);

        System.out.println("Введите элемент для бинарного поиска: ");
        item = input.nextInt();
        first = 0;
        last = num - 1;

        binarySearch(array, first, last, item);
    }

    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;

        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;

            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }

        if (first <= last) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
    }

}

