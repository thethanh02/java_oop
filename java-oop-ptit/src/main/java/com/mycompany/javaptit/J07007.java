package com.mycompany.javaptit;

import java.io.*;
import java.util.*;
class WordSet {
    private TreeSet<String> set = new TreeSet<>();
    public WordSet(String s) {
        try (Scanner sc = new Scanner(new File(s))) {
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String[] token = data.split("\\s+");
                for (String i : token) {
                    this.set.add(i.toLowerCase());
                }
            }
        } catch (FileNotFoundException e) {
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (String i : set) 
            res = res.concat(i+"\n");
        return res;
    }
    
}
public class J07007 {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
