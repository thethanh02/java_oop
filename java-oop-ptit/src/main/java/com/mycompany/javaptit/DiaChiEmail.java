package com.mycompany.javaptit;

import java.util.*;

public class DiaChiEmail {
    static int search(Vector<String> v, String s) {
        for (int i = 0; i < v.size(); i++)
            if (s.equals(v.get(i))) return i;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Vector<String> stringList = new Vector<>();
        Vector<Integer> countList = new Vector<>();
        while (t-->0) {
            String s = sc.nextLine();
            StringTokenizer words = new StringTokenizer(s);
            Vector<String> v = new Vector<>();
            
            while (words.hasMoreTokens()) {
                String temp = words.nextToken().toLowerCase();
                v.add(temp);
            }
            String newS="";
            for (int i = 0; i < v.size()-1; i++)
                newS += v.get(i).charAt(0);
            String res = v.get(v.size()-1)+newS;
            int tim = search(stringList, res);
            if (tim == -1) {
                stringList.add(res);
                countList.add(1);
                System.out.println(res+"@ptit.edu.vn");
            } else {
                countList.set(tim, countList.get(tim)+1);
                System.out.println(res+countList.get(tim)+"@ptit.edu.vn");
            }
        }
    }
}
