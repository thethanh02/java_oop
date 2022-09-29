package com.mycompany.javaptit;

import java.util.*;

public class J08012 {
    static String hinhSao(HashMap<Integer, Integer> map, int n) {
        for (int i : map.keySet()) 
            if (map.get(i) < n-1 && map.get(i) > 1) return "No";
        return "Yes";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0, x, y; i < n-1; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (!map.containsKey(x)) {
                map.put(x, 1);
            } else map.replace(x, map.get(x)+1);
            if (!map.containsKey(y)) {
                map.put(y, 1);
            } else map.replace(y, map.get(y)+1);
        }
        
        System.out.println(hinhSao(map, n));
    }
}
