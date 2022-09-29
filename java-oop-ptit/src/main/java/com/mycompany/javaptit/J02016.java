package com.mycompany.javaptit;

import java.util.*;

public class J02016 {
    static String Pytago(long[] a, int n) {
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                long sum = a[i] + a[j];
                if (Arrays.binarySearch(a, j+1, n, sum) >= j+1) return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n], b = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                b[i] = a[i] * a[i];
            }
            Arrays.sort(b);
            System.out.println(Pytago(b, n));
        }
    }
}
