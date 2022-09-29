package javaoop;

import java.lang.Math.*;
import java.util.*;

//class SinhVien {
//    private int id;
//    private String name, classString, dob;
//    private double markGPA;
//
//    public SinhVien(int id, String name, String classString, String dob, double markGPA) {
//        this.id = id;
//        this.name = name;
//        this.classString = classString;
//        this.dob = dob;
//        this.markGPA = markGPA;
//    }
//
//    public double getMarkGPA() {
//        return markGPA;
//    }
//    
//    public String getFormattedName() {
//        String[] s = name.toLowerCase().trim().split("\\s+");
//        String res = "";
//        for (String i : s)
//            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
//        return res.substring(0, res.length()-1);
//    }
//    
//    public String getFormattedDateofBirth() {
//        String res = dob;
//        if (res.charAt(3) == '/')
//            res = res.substring(0, 2) + "0"  + res.substring(2);
//        if (res.charAt(1) == '/')
//            res = "0" + res;
//        return res;
//    }
//    
//    public String idString() {
//        String s = "B20DCCN";
//        for (int i = 1; i < 3 - Math.log10(id); i++)
//            s += "0";
//        return s + Integer.toString(id);
//    }
//
//    @Override
//    public String toString() {
//        return idString() + " " + getFormattedName() + " " + classString + " " + this.getFormattedDateofBirth() + " " + String.format("%.2f", markGPA);
//    }
//}
//public class DanhSachSinhVien {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        ArrayList<SinhVien> list = new ArrayList<>();
//        for (int test = 1; test <= t; test++) {
//            sc.nextLine();
//            SinhVien sinhVien = new SinhVien(test, sc.nextLine(), sc.next(), sc.next(), sc.nextDouble());
//            list.add(sinhVien);
////            System.out.println(sinhVien);
//        }
//        
//        Collections.sort(list, new Comparator<SinhVien>() {
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                return Double.compare(o2.getMarkGPA(), o1.getMarkGPA());
//            }
//        });
//        
//        for (SinhVien sinhVien : list)
//            System.out.println(sinhVien);
//    }
//}
