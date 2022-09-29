package com.mycompany.javaptit;

import java.util.*;

public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Deque<Character> deque = new LinkedList<>();
        deque.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            while (!deque.isEmpty() && s.charAt(i) > deque.peekLast())
                deque.removeLast();
            deque.add(s.charAt(i));
        }
        for (char i : deque) 
            System.out.print(i);
    }
}
