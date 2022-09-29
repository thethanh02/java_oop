package com.mycompany.javaptit;

import java.util.*;

public class JKT015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int index = 0;
        Vector<Character> list = new Vector<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                if (index > 0) index--;
            } else if (s.charAt(i) == '>') {
                if (index < list.size()) index++;
            } else if (s.charAt(i) == '-') {
                if (index > 0) {
                    index--;
                    list.removeElementAt(index);
                }
            } else {
                list.insertElementAt(s.charAt(i), index);
                index++;
            }
        }
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i));
    }
}
