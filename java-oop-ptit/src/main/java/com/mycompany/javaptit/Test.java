package com.mycompany.javaptit;

import java.util.*;

public class Test {
    static String Result(String s) {
        if (s.length() < 2 || s.substring(s.length() - 2).equals("86"))
            return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(Result(s));
        }
    }
}
