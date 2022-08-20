package com.mycompany.javaptit;

import java.util.*;

public class ChuanHoaXauHoTen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            String s = sc.nextLine();
            StringTokenizer words = new StringTokenizer(s);
            Vector<String> v = new Vector<>();
            while (words.hasMoreTokens()) {
                String temp = words.nextToken().toLowerCase();
                StringBuilder sb = new StringBuilder(temp);
                sb.setCharAt(0, Character.toUpperCase(temp.charAt(0)));
                v.add(sb.toString());
            }
            v.set(0, v.get(0).toUpperCase());
            for (int i = 1; i < v.size()-1; i++)
                System.out.print(v.get(i) + " ");
            System.out.println(v.get(v.size()-1) + ", "+v.get(0));
        }
    }
}
