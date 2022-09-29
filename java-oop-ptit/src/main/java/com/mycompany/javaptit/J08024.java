package com.mycompany.javaptit;

import java.util.*;

public class J08024 {
    static long Solution(int n) {
        Deque<Long> deque = new LinkedList<>();
        deque.add((long) 9);
        long x = 9;
        while (true) {
            x = deque.pollFirst();
            if (x % n == 0) return x;
            deque.add(x*10);
            deque.add(x*10 + 9);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(Solution(n));
        }
    }
}
