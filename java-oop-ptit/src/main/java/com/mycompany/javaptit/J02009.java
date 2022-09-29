package com.mycompany.javaptit;

import java.util.*;

public class J02009 {
    static class Pair{
        private int x, y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getFirst() { return x; }
        public int getSecond() { return y; }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            list.add(new Pair(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return Integer.compare(o1.getFirst(), o2.getFirst());
            }
            
        });
        
        int sum = list.get(0).getFirst();
        for (int i = 1; i < t; i++) {
            sum += list.get(i-1).getSecond();
            if (list.get(i).getFirst() > sum) {
                sum = list.get(i).getFirst();
            }
        }
        System.out.println(sum+list.get(t-1).getSecond());
    }
}
