package com.company;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("Мыло"));
    }

    static String reverse(String s){
        StringBuilder rez = new StringBuilder();

        for(int i=0, j=s.length()-1; i<=s.length()-1; ++i, --j){
            rez.append(s.charAt(j));
        }

        return rez.toString();
    }
}

