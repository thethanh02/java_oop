package com.mycompany.javaptit;

import java.util.*;

public class JKT013 {
    static Vector<String> v = new Vector<String>();
    static int[] a = new int[16];
    static void Preparation() {
        int qsize = 0, cnt = 1;
        Deque<String> deque = new LinkedList<>();
        deque.add("6");
        deque.add("8");
        String x = "";
        while (true) {
            x = deque.pollFirst();
            if (x.length() > cnt) a[cnt++] = qsize;
            if (x.length() > 15) return;
            qsize++;
            v.add(x);
            
            deque.add(x.concat("6"));
            deque.add(x.concat("8"));
        }
    }
    public static void main(String[] args) {
        Preparation();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            
            System.out.println(a[n]);
            for (int i = a[n] - 1; i >= 0; i--)
                System.out.print(v.get(i) + " ");
            System.out.println();
        }
    }
}
