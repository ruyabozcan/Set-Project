package com.company;

import java.util.*;

public class Task2 {
    public static void main(String args[]){
        Concardance("Ruya");

    }
    public static void Concardance(String s){
        Map<Character, Set<Integer>> h = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char charAt = s.charAt(i);
            Set<Integer> set = h.get(charAt);
            if (set == null) {
                set = new HashSet<Integer>();
            }
            set.add(i);
            h.put(charAt, set);
        }
        System.out.println(h);
    }
}
