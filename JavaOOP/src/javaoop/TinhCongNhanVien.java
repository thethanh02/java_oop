package javaoop;

import static java.lang.Math.log10;
import java.util.*;

class NhanVien {
    private String name, position;
    private int id, salary, workDay;

    public NhanVien(int id, String name, int salary, int workDay, String position) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.workDay = workDay;
        this.position = position;
    }

    public String getIdString() {
        String res = "NV";
        for (int i = 1; i < 2 - log10(id); i++)
            res += "0";
        return res + id;
    }
    
    public int luongThang() {
        return salary * workDay;
    }
    
    public int thuong() {
        if (workDay >= 25)
            return luongThang() / 5;
        else if (workDay >= 22)
            return luongThang() / 10;
        return 0;
    }
    
    public int phuCap() {
        String s = position;
        if (s.equals("GD"))
            return 250000;
        else if (s.equals("PGD"))
            return 200000;
        else if (s.equals("TP"))
            return 180000;
        return 150000;
    }
    
    public int thuNhap() {
        return luongThang() + thuong() + phuCap();
    }

    @Override
    public String toString() {
        return getIdString() + " " + name + " " + luongThang()+ " " + thuong() + " " + phuCap() + " " + thuNhap();
    }
    
}
public class TinhCongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<NhanVien> list = new ArrayList<>();
        for (int test = 1; test <= t; test++) {
            sc.nextLine();
            NhanVien nhanVien = new NhanVien(test, sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next());
            list.add(nhanVien);
        }
        
        int sum = 0;
        for (NhanVien nhanVien : list) {
            System.out.println(nhanVien);
            sum += nhanVien.thuNhap();
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}
