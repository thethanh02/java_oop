package com.mycompany.javaptit;

import java.util.*;

public class JKT014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n], res = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            
            Stack<Integer> stack = new Stack<>();
            stack.push(0);
            res[0] = 1;
            for (int i = 1; i < n; i++) {
                while (!stack.isEmpty() && a[stack.peek()] <= a[i])
                    stack.pop();
                res[i] = (stack.isEmpty() ? (i+1) : (i-stack.peek()));
                stack.push(i);
            }
            for (int i = 0; i < n; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}
