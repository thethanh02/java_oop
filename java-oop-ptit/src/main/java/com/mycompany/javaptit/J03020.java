package com.mycompany.javaptit;

import java.util.*;

public class J03020 {
    static boolean thuanNghich(String s) {
        StringBuilder s_reversed, temp = new StringBuilder(s);
        s_reversed = temp.reverse();
        return s.equals(s_reversed.toString());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = 0;
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] token = s.split("\\s+");
            for (String i : token) {
                if (map.containsKey(i)) {
                    int val = map.get(i);
                    map.replace(i, val+1);
                } else if (thuanNghich(i)) {
                    map.put(i, 1);
                    if (i.length() > m) m = i.length();
                }
            }
//            System.out.println(s);
        }
        for (String i : map.keySet()) {
            if (i.length() == m)
                System.out.println(i + " " +map.get(i));
        }
    }
}
