package com.mycompany.javaptit;

import java.math.BigInteger;
import java.util.*;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger eleven = new BigInteger("11");
            BigInteger zero = new BigInteger("0");
            if (a.mod(eleven).equals(zero))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
