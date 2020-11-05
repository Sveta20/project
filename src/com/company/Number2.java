package com.company;

public class Number2 {
    public static void main(String[] args) {
        int a = 125436545;
        int sum = 0;
        int i;
        boolean c = true;

        for (i = 2; i < sum; i++) {
            if (sum % i == 0) {
                c = false;
                break;
            }
        }

        if (c)
            System.out.println("false");
        else
            System.out.println("true");
        }

    }


