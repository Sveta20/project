package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Massiv {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = 0;

        int[] array = new int[5];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
            if (maximum < array[i]){
                maximum = array[i];
            }
        }

        System.out.print(maximum);
    }
}

