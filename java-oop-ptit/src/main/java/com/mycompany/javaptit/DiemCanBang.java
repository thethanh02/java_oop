package com.mycompany.javaptit;

import java.util.Scanner;

public class DiemCanBang {
    static int diemCanBang(int[] a, int n, int sum) {
        int leftSum = 0;
        for (int i = 0; i < n-1; i++) {
            leftSum += a[i];
            if (sum+a[i]-leftSum == leftSum) return i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            System.out.println(diemCanBang(a, n, sum));
        }
    }
}
