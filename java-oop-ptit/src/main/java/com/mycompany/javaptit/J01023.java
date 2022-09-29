package com.mycompany.javaptit;

import java.util.*;

public class J01023 {
    static StringBuilder s;
    static String p = "+-*/";
    static Vector<Integer> pos = new Vector<>();
    static boolean caculator() {
        String temp1 = s.substring(0, 2), temp2 = s.substring(5, 7), temp3 = s.substring(10, 12);
        int n1 = Integer.valueOf(temp1), n2 = Integer.valueOf(temp2), n3 = Integer.valueOf(temp3);
        if (s.charAt(3) == '+') {
            if (n1 + n2 == n3) return true;
        } else if (s.charAt(3) == '-') {
            if (n1 - n2 == n3) return true;
        } else if (s.charAt(3) == '*') {
            if (n1 * n2 == n3) return true;
        } else if (n1 % n2 == 0 && n1 / n2 == n3) return true;
        return false;
    }
    static boolean Try(int index) {
        if (index == pos.size()) {
            if (caculator()) return true;
        }
        for (int i = index; i < pos.size(); i++) {
            if (pos.get(i) == 3) {
                for (int j = 0; j < 4; j++) {
                    s.setCharAt(pos.get(i), p.charAt(j));
                    if (Try(i+1)) return true;
                }
            } else {
                int h = '0';
                if (pos.get(i) == 0 || pos.get(i) == 5 || pos.get(i) == 10) h++;
                for (int j = h; j <= '9'; j++) {
                    s.setCharAt(pos.get(i), (char) j);
                    if (Try(i+1)) return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            s = new StringBuilder(sc.nextLine());
            pos.clear();
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) == '?') pos.add(i);
            if (Try(0))
                System.out.println(s);
            else 
                System.out.println("WRONG PROBLEM!");
        }
    }
}
