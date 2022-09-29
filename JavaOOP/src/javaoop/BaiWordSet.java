package javaoop;

import java.util.*;


class WordSet {
    private String s;

    public WordSet(String s) {
        this.s = s;
    }
    
    public WordSet union(WordSet s2) {
        Set<String> set = new TreeSet<>();
        String[] temp = s.toLowerCase().trim().split("\\s+");
        for (String i : temp)
            set.add(i);
        
        temp = s2.s.toLowerCase().trim().split("\\s+");
        for (String i : temp)
            set.add(i);
        
        String res = "";
        for (String i : set)
            res += i + " ";
        return new WordSet(res);
    }
    
    public WordSet intersection(WordSet s2) {
        Set<String> set = new TreeSet<>();
        String[] temp = s2.s.toLowerCase().trim().split("\\s+");
        for (String i : temp)
            set.add(i);
        
        String res = "", low = s.toLowerCase();
        for (String i : set)
            if (low.contains(i))
                res += i + " ";
        return new WordSet(res);
    }

    @Override
    public String toString() {
        return s;
    }
}
public class BaiWordSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
