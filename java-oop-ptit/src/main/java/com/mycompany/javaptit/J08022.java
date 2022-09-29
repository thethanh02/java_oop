package com.mycompany.javaptit;

import java.util.*;

public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            
            // Solution
            Stack<Integer> stack = new Stack<>(), res = new Stack<>();
            for (int i = n-1; i >= 0; i--) {
                while (!stack.isEmpty() && stack.peek() <= a[i])
                    stack.pop();
                
                if(stack.isEmpty()) res.push(-1);
                else res.push(stack.peek());
                stack.push(a[i]);
            }
            
            while (!res.isEmpty()) {
                System.out.print(res.peek() + " ");
                res.pop();
            }
            System.out.println();
        }
    }
}
