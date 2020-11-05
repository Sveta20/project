package com.company;

public class Number {

    public static void main(String[] args) {
        int a = 125436545;
        int i;
        boolean c = true;
        for ( i = 2; i < a; i++)
        {
            if (a % i == 0) {
                System.out.println("false");
                c = false;
                break;
            }
            }

        }

    }

