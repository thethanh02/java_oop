package com.mycompany.javaptit;

import java.util.*;

public class J03031 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();
        while(t -- > 0){
            x.nextLine();
            String s = x.nextLine();
            int k = x.nextInt();
            Set < Character > st = new TreeSet< Character > ();
            for(int i = 0; i < s.length(); i++)    st.add(s.charAt(i));
            if(26 - st.size() <= k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}