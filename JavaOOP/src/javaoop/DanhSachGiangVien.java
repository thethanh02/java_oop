package javaoop;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Math.*;
import static java.lang.Math.log10;
import java.util.*;

class GiangVien {
    private int id;
    private String name, boMon;

    public GiangVien(int id, String name, String boMon) {
        this.id = id;
        this.name = name;
        this.boMon = boMon;
    }
    
    public String getIdString() {
        String res = "GV";
        for (int i = 1; i < 2 - log10(id); i++)
            res += "0";
        return res + id;
    }

    public String getLowerName() {
        return name.toLowerCase();
    }
    
    public String getLastName() {
        String[] token = name.trim().split("\\s+");
        return token[token.length - 1];
    }

    public String getVietTatBoMon() {
        String[] s = boMon.toUpperCase().split("\\s+");
        String res = "";
        for (String i : s)
            res += i.substring(0, 1);
        return res;
    }
    
    @Override
    public String toString() {
        return getIdString() + " " + name + " " + getVietTatBoMon();
    }
}
public class DanhSachGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> list = new ArrayList<>();
        for (int test = 1; test <= t; test++) {
            GiangVien giangVien = new GiangVien(test, sc.nextLine(), sc.nextLine());
            list.add(giangVien);
        }
        
//        Collections.sort(list, Comparator
//                    .comparing(GiangVien:: getLastName)
//                    .thenComparing(GiangVien:: getIdString));
        
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String s = sc.nextLine();
            String lowString = s.toLowerCase();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for (GiangVien giangVien : list)
                if (giangVien.getLowerName().contains(lowString))
                    System.out.println(giangVien);
        }
    }
}
