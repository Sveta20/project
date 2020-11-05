package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Binarysearch2 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(10);
        al.add(20);

        int key = 2;
        int res = Collections.binarySearch(al, key);
        if (res >= 0)
            System.out.println(key + " " + "true");
        else
            System.out.println("false");

    }
}
