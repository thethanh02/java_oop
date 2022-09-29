package com.mycompany.javaptit;

import java.io.*;
import java.util.*;

public class J07001 {
    public static void main(String[] args) {
        try {
            File obj = new File("DATA.in");
//            System.out.println(obj.getAbsolutePath());
            try (Scanner sc = new Scanner(obj)) {
                while (sc.hasNextLine()) {
                    String data = sc.nextLine();
                    System.out.println(data);
                }
            }
        } catch (FileNotFoundException e) {
        }
    }
}
