package com.mycompany.javaptit;

import java.util.*;

public class J02026 {
    public static int n, k;
    public static int[] a = new int[100];
    public static int[] b = new int[100];
    public static void ql(int i){
        for(int j = a[i - 1] + 1; j <= n - k + i; j++){
            a[i] = j;
            if(i == k){
                for(int h = 1; h <= k; h++) System.out.print(b[a[h]- 1] + " ");
                System.out.println();
            }else ql(i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();
        while(t -- > 0){
            n = x.nextInt();
            k = x.nextInt();
            for(int  i = 0; i < n ;i++) b[i] = x.nextInt();
            Arrays.sort(b, 0, n);
            ql(1);
        }
    }
}