package javaoop;

import java.lang.Math.*;
import java.util.*;

class SinhVien {
    private String id, name, classString, email;

    public SinhVien(String id, String name, String classString, String email) {
        this.id = id;
        this.name = name;
        this.classString = classString;
        this.email = email;
    }

    public String getId() {
        return id;
    }
    
    public String getClassString() {
        return classString;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + classString + " " + email;
    }
}
public class J05020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        
        int t = sc.nextInt();
        sc.nextLine();
        for (int test = 1; test <= t; test++) {
            SinhVien sinhVien = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(sinhVien);
        }
        
        Collections.sort(list, Comparator
                    .comparing(SinhVien:: getClassString));
        
        for (SinhVien sinhVien : list)
            System.out.println(sinhVien);
    }
}
