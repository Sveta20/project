package com.company;

public class Trigl {
    public static void main(String[] args) {
            System.out.println("Triangle info " + args[0] + args[1] + args[2]);
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            if (a==b && b==c && a==c) {
                System.out.println("Равносторонний");
            }
            else if (a==b||b==c||a==c) {
                System.out.println("Равнобедренный");
            }
            else {
                System.out.println("Разносторонний");
            }
        }
    }

