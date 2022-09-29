package javaoop;

import java.io.*;
import java.util.*;
import java.math.*;

class HocSinh {
    private int id;
    private String name;
    private BigDecimal[] mark;

    public HocSinh(int id, String name, BigDecimal[] mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public String getIdString() {
        String res = "HS";
        for (int i = 1; i < 2 - Math.log10(id); i++)
            res += "0";
        return res + Integer.toString(id);
    }

    public BigDecimal getAverageMark() {
        BigDecimal res = mark[0].add(mark[1]), twelve = new BigDecimal("12.0");
        for (int i = 0; i < 10; i++)
            res = res.add(mark[i]);
        res = res.divide(twelve, new MathContext(2));
        return res;
    }
    
    
    
    public String getRank() {
        BigDecimal am = getAverageMark();
        if (am.compareTo(new BigDecimal("9.0")) >= 0) return "XUAT SAC";
        else if (am.compareTo(new BigDecimal("8.0")) >= 0) return "GIOI";
        else if (am.compareTo(new BigDecimal("7.0")) >= 0) return "KHA";
        else if (am.compareTo(new BigDecimal("5.0")) >= 0) return "TB";
        return "YEU";
    }

    @Override
    public String toString() {
        return getIdString() + " " + name + " " + getAverageMark() + " " + getRank();
    }
    
}
public class J05018BangDiemHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<HocSinh> list = new ArrayList<>();
        for (int test = 1; test <= t; test++) {
            sc.nextLine();
            String name = sc.nextLine();
            BigDecimal[] mark = new BigDecimal[10];
            for (int i = 0; i < 10; i++)
                mark[i] = new BigDecimal(sc.next());
            HocSinh hocSinh = new HocSinh(test, name, mark);
            list.add(hocSinh);
        }
        
        Collections.sort(list, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                return o2.getAverageMark().compareTo(o1.getAverageMark());
            }
        });
        
        for (HocSinh hocSinh : list)
            System.out.println(hocSinh);
    }
}
