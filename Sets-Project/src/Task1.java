// RÜYA BOZCAN
// COMPUTER ENGINEERING 
// ABU

package com.company;

import java.util.*;

public class Task1 {
    public static void main(String args[]){
        String a = "Ruya";
        String b = "Ummuyan";
        String c = "Satı";

        System.out.println(uniqueChars(a));
        System.out.println(uniqueChars(b));
        System.out.println(uniqueChars(c));

    }

    public static int uniqueChars(String s){
        char[] chars = s.toCharArray();
        Map<Character, Integer> text = new HashMap<>();
        ArrayList<Character> notUniqueChars = new ArrayList<>();
        for(int i = 0; i < chars.length; i++){
            if(text.put(chars[i], 0) != null){
                notUniqueChars.add(chars[i]);
            }
        }
        System.out.println(notUniqueChars);

        return s.length() - notUniqueChars.size() - 1;
    }
}

// RÜYA BOZCAN
// COMPUTER ENGINEERING 
// ABU
