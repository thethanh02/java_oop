package javaoop;

import java.util.*;

class ThiSinh {
    private int id;
    private String name, dob;
    private double mark1, mark2, mark3;

    public ThiSinh(int id, String name, String dob, double mark1, double mark2, double mark3) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    ThiSinh(int test, String nextLine, long l, float f, long l0, float f0, long l1, float f1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getSumMark() {
        return (mark1 + mark2 + mark3);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + dob + " " + getSumMark();
    }
}
public class ThuKhoaKyThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<ThiSinh> list = new ArrayList<>();
        double maxMark = 0;
        for (int test = 1; test <= t; test++) {
            sc.nextLine();
            ThiSinh thiSinh = new ThiSinh(test, sc.nextLine(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            if (maxMark < thiSinh.getSumMark()) maxMark = thiSinh.getSumMark();
            list.add(thiSinh);
        }
        for (ThiSinh thiSinh : list) {
            if (thiSinh.getSumMark() == maxMark)
                System.out.println(thiSinh);
        }
    }
}
