package com.company;

import java.util.*;

public class Duble {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        h.add("Hulio");
        h.add("Hugo");
        h.add("Apache");
        h.add("Hugo");
        h.add("Apache");

        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
