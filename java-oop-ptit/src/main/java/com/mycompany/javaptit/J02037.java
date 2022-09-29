package com.mycompany.javaptit;

import java.util.*;

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] token = s.split("\\s+");
            int chan = 0;
            for (String i : token) 
                if (i.charAt(i.length()-1) % 2 == 0) 
                    chan++;
            
            if (token.length % 2 == 0) {
                if (chan > token.length - chan)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else {
                if (token.length - chan > chan)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
