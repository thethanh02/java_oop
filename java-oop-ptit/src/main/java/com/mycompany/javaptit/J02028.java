package com.mycompany.javaptit;

import java.util.*;

public class J02028 {
    public static int kt(int[] a,int n, long k){
        long s = 0, j = 0;
        for(int i = 0; i < n; i++){
            s += a[i];
            if(s > k){
                while(i > (int)j){
                    s -= a[(int)j];
                    j++;
                    if(s <= k) break;
                }
            }
            if(s == k) return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();
        while(t -- > 0){
            int n = x.nextInt();
            int[] a = new int[n + 5];
            long k = x.nextLong();
            for(int i= 0; i < n; i++) a[i] = x.nextInt();
            System.out.println((kt(a, n , k) == 1 ? "YES" : "NO"));
        }
    }
}
