package javaoop;

import java.io.*;
import java.util.*;


class Pair<K, V> {
    private K key;
    private V val;

    public Pair(K key, V val) {
        this.key = key;
        this.val = val;
    }
    
    public static boolean nguyenTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) 
            if (n % i == 0) return false;
        return true;
    }
    
    public boolean isPrime() {
        return nguyenTo((Integer) val) &&nguyenTo((Integer) key);
    }

    @Override
    public String toString() {
        return key + " " + val;
    }
}
public class LopPair {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
