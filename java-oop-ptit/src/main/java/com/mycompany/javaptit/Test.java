package com.mycompany.javaptit;

import java.math.BigInteger;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if (a.mod(b).equals(0) || b.mod(a).equals(0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
