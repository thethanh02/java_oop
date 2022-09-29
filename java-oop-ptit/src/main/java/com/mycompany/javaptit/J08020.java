package com.mycompany.javaptit;

import java.util.*;

public class J08020 {
    static String kiemTraDayNgoac(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else {
                if (stack.isEmpty()) return "NO";
                if (s.charAt(i) == ')' && stack.peek() != '(') return "NO";
                else if (s.charAt(i) == ']' && stack.peek() != '[') return "NO";
                else if (s.charAt(i) == '}' && stack.peek() != '{') return "NO";
                stack.pop();
            }
        }
        return "YES";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(kiemTraDayNgoac(s));
        }
    }
}
