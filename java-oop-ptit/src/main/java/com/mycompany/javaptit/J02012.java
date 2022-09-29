package com.mycompany.javaptit;

import java.util.*;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n*n];
        for (int i = 0; i < n*n; i++)
            b[i] = sc.nextInt();
        Arrays.sort(b);
        int dong = n, cot = n, k = 0, p = 0, i, j;
        int[][] a = new int[n][n];
        while (k < n*n) {
            for (i = p; i < cot; i++)
                a[p][i] = b[k++];
            for (i = p+1; i < dong; i++)
                a[i][cot-1] = b[k++];
            for (i = cot-2; i >= p; i--)
                a[dong-1][i] = b[k++];
            for (i = dong-2; i > p; i--)
                a[i][p] = b[k++];
            dong--;
            cot--;
            p++;
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) 
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}
