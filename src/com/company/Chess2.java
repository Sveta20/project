package com.company;

import java.util.Scanner;

public class Chess2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xNext = Integer.parseInt(args[0]);
        int yNext = Integer.parseInt(args[1]);
        int Xcur = Integer.parseInt(args[2]);
        int Ycur = Integer.parseInt(args[3]);
        boolean m = true;
        if((Math.abs(xNext - Xcur) == 1 && Math.abs(yNext - Ycur) == 2) || (Math.abs(xNext - Xcur) == 2 && Math.abs(yNext - Ycur) == 1))
            System.out.println ("m");
        else
            System.out.println("false");
    }
}
