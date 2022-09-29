package com.mycompany.javaptit;

import java.util.*;

public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> ds = new Vector<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim().toLowerCase();
            String[] token = s.split("\\s+");
            ds.addAll(Arrays.asList(token));
        }
        ds.setElementAt(ds.get(0).substring(0, 1).toUpperCase() + ds.get(0).substring(1), 0);
        for (int i = 0; i < ds.size(); i++) {
            int last = ds.get(i).length();
            if (ds.get(i).charAt(last-1) == '.' || ds.get(i).charAt(last-1) == '!' || ds.get(i).charAt(last-1) == '?') {
                ds.setElementAt(ds.get(i).substring(0, last-1), i);
                if (i+1 < ds.size())
                    ds.setElementAt("\n" + ds.get(i+1).substring(0, 1).toUpperCase() + ds.get(i+1).substring(1), i + 1);
            } else
                ds.setElementAt(ds.get(i) + " ", i);
        }
        
        for (int i = 0; i < ds.size(); i++)
            System.out.print(ds.get(i));
    }
}
