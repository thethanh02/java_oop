package com.mycompany.javaptit;

import java.util.*;

public class ThuGonDaySo {
    static int thuGon(int[] a, int n, int[] mark) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            while (mark[j] == 1 && j > 0) j--;
            if (mark[j] == 0 && (a[i]+a[j]) % 2 == 0) {
                mark[i] = mark[j] = 1;
                count += 2;
                i--;
            }
        }
        return n - count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] mark = new int[n];
        for (int i = 0; i < n; i++) 
            a[i] = sc.nextInt();
        
        System.out.println(thuGon(a, n, mark));
    }
}
