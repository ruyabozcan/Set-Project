// RÜYA BOZCAN
// COMPUTER ENGINEERING 
// ABU

package com.company;

import java.util.*;
//Kume gibi random sira onemsiz her turku type olur bosluk kabul eder null
public class Task3 {
    public static void main(String args[]){
        HashSet<String> h = new HashSet<>();
        HashSet<String> h2 = new HashSet<>();

        addElement(h, "Atahan");
        addElement(h, "Satı");
        addElement(h, "Emre");
        addElement(h, "Yaren");

        System.out.println("Set1: " + h);

        addElement(h2, "Ummuyan");
        addElement(h2, "Mert");
        addElement(h2, "Ruya");
        addElement(h2, "Ali");

        System.out.println("Set2: " + h2);

        System.out.println("Set1 isEmpty ? " + h.isEmpty());
        System.out.println("Set2 isEmpty ? " + h2.isEmpty());

        List<String> list = new ArrayList<>(h);
        System.out.println("Set1 ArrayList: " + list);

        System.out.println("Comparing: " + compare2sets(h, h2));

        setsIntersection(h, h2);
        System.out.println("Intersection: " + h);

        h = (HashSet)h2.clone();

        System.out.println("After clone Set2 to Set1: " + h);

        h.removeAll(h);
        System.out.println("After removeAll Set1: " + h);
    }

    public static void addElement(HashSet h, String n){
        h.add(n);
    }

    public static boolean compare2sets(HashSet h, HashSet h2){
        return h.equals(h2);
    }

    public static void setsIntersection(HashSet h, HashSet h2){
        h.retainAll(h2);
    }
}

// RÜYA BOZCAN
// COMPUTER ENGINEERING 
// ABU
