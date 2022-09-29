package com.mycompany.javaptit;

import java.io.*;
import java.util.*;

public class J07006WA {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.IN"))) {
            while (true) {
                ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
                for (int i = 0; i < a.size(); i++) {
                    if (map.containsKey(a.get(i)))
                        map.put(a.get(i), map.get(a.get(i))+1);
                    else
                        map.put(a.get(i), 1);
                }
            }
            
        } catch (FileNotFoundException | EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
        } finally {
            for (int i : map.keySet())
                System.out.println(i + " " + map.get(i));
        }
    }
}
