package com.mycompany.javaptit;

import java.util.*;

public class J08021 {
    static int ngoacDungDaiNhat(String s) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push(i);
            else {
                stack.pop();
                if (!stack.isEmpty()) ans = Integer.max(ans, i - stack.peek());
                else stack.push(i);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(ngoacDungDaiNhat(s));
        }
    }
}
