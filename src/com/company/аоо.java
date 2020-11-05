package com.company;

public class аоо {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for( int num : array) {

            sum = sum + num;
        }
        System.out.println("Сумма элементов массива равна: " + sum);
    }

}
