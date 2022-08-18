package com.mycompany.javaptit;

import java.util.*;

public class SoXaCach {
    static int n;
    static int[] a = new int[20]; 
    static boolean[] vis = new boolean[20];
    static boolean check() {
        for (int i = 1; i < n; i++) 
            if (Math.abs(a[i] - a[i + 1]) == 1) return false;
        return true;
    }
    static void in() {
        for (int i = 1; i <= n; i++) 
            System.out.print(a[i]);
        System.out.println();
    }
    static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (!vis[j]) {
                a[i] = j; vis[j] = true;
                if (i == n) {
                    if (check()) in();
                } else Try(i + 1);
                vis[j] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) vis[i] = false;
            Try(1);
            System.out.println();
        }
    }
}
