package com.mycompany.javaptit;

import java.io.*;
import java.util.*;

public class J07002 {
    static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        try {
            File obj = new File("DATA.in");
            long sum = 0;
            try (Scanner sc = new Scanner(obj)) {
                while (sc.hasNextLine()) {
                    String data = sc.nextLine().trim();
                    String[] token = data.split("\\s+");
                    for (String i : token) {
//                        if (i.chars().allMatch( Character::isDigit))
//                            System.out.println(Integer.valueOf(i));
                        if (isInteger(i))
                            sum += Integer.valueOf(i);
                    }
                }
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
        }
    }
}
