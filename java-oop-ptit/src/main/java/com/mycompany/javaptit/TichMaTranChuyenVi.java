package com.mycompany.javaptit;

import java.util.*;

public class TichMaTranChuyenVi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++) a[i][j] = sc.nextInt();
            
            System.out.println("Test "+test+":");
            int[][] res = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        res[i][j] += a[i][k]*a[j][k];
                    }
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
    