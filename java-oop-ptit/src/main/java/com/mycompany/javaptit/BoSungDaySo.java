package com.mycompany.javaptit;

import java.util.Scanner;

public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int[] mark = new int[201];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            mark[a]++;
            if (a > max) max = a;
        }
        boolean ok = false;
        for (int i = 1; i <= max; i++) {
            if (mark[i] == 0) {
                System.out.println(i);
                ok = true;
            }
        }
        if (!ok) System.out.println("Excellent!");
    }
}
