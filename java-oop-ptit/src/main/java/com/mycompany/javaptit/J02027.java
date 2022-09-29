package com.mycompany.javaptit;

import java.util.*;

public class J02027 {
    static int lower_bound(int array[], int low, int high, int key) {
        if (low > high) {
            return low;
        }
        int mid = low + (high - low) / 2;
        if (key <= array[mid]) {

            return lower_bound(array, low, mid - 1, key);
        }
        return lower_bound(array, mid + 1, high, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            long res = 0;
            for (int i = 0; i < n; i++) {
                int x = lower_bound(a,i+1,n-1,a[i]+k);
                res += x - i-1;
            }
            System.out.println(res);
        }

    }
}