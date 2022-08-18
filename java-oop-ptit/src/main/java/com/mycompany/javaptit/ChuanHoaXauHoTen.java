package com.mycompany.javaptit;

import java.util.*;

public class ChuanHoaXauHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            String s = sc.nextLine();
            StringTokenizer words = new StringTokenizer(s);
            while (words.hasMoreTokens()) {
                String temp = words.nextToken().toLowerCase();
                StringBuilder sb = new StringBuilder(temp);
                sb.setCharAt(0, Character.toUpperCase(temp.charAt(0)));
                System.out.print(sb+" ");
            }
            System.out.println();
        }
    }
}
