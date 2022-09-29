package com.mycompany.javaptit;

import java.util.*;

public class J03040 {
    static String bienSoDep(Vector<Character> num) {
        int ok1 = 0, ok2 = 0;
        for (int i = 0; i < 5; i++) {
            if (i > 0 && num.get(i-1) < num.get(i)) ok1++;
            if (num.get(i) == '6' || num.get(i) == '8') ok2++;
        }
        if (ok1 == 4 || ok2 == 5) return "YES";
        if (num.get(0) == num.get(1) && num.get(1) == num.get(2) && num.get(3) == num.get(4)) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String bienSo = sc.next();
            Vector<Character> num = new Vector<>();
            for (int i = 5; i < bienSo.length(); i++)
                if (i != 8) num.add(bienSo.charAt(i));
            System.out.println(bienSoDep(num));
        }
    }
}
