// RÜYA BOZCAN
// COMPUTER ENGINEERING 
// ABU

package com.company;

import java.util.*;
//azalandan artan sirali null yok
public class Task4 {
    public static void main(String args[]){
        TreeSet<Integer> t = new TreeSet();
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        int count = 0;
        while(count < n){
            t.add(random.nextInt(50));
            count++;
        }
        System.out.println("TreeSet: " + t);
        reverseSet(t);

        System.out.println("First Element: " + t.first());
        System.out.println("Last Element: " + t.last());

        System.out.print("Enter a number: ");
        int m = scan.nextInt();
        greaterEqK(t, m);

        System.out.print("Enter a number: ");
        int k = scan.nextInt();
        removeElem(t, k);
        System.out.println("After Remove " + k + ": " + t);
    }

    public static void reverseSet(TreeSet a){
        Iterator<Integer> at = a.descendingIterator();
        System.out.print("After reversed: ");
        System.out.println(a.descendingSet());
    }

    public static void greaterEqK(TreeSet t, int n){
        System.out.println(t.tailSet(n));
    }

    public static void removeElem(TreeSet t, int n){
        t.remove(n);
    }
}

// RÜYA BOZCAN
// COMPUTER ENGINEERING 
// ABU
