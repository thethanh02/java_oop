package com.mycompany.javaptit;

import java.math.BigInteger;
import java.util.*;

public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger zero = new BigInteger("0");
            if (a.mod(b).equals(zero) || b.mod(a).equals(zero)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
