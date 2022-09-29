package javaoop;

import java.io.*;
import static java.lang.Math.log10;
import java.util.*;

class MatHang {
    private int id;
    private String name, calculationUnit;
    private double price, amount;

    public MatHang(int id, String name, String calculationUnit, double price, double amount) {
        this.id = id;
        this.name = name;
        this.calculationUnit = calculationUnit;
        this.price = price;
        this.amount = amount;
    }

    public String getIdString() {
        String res = "MH";
        for (int i = 1; i < 2 - log10(id); i++)
            res += "0";
        return res + id;
    }
    
    public int phiVanChuyen() {
        double res = price * amount * 5 / 100;
        return (int) Math.round(res);
    }
    
    public int thanhTien() {
        double res = price * amount  + phiVanChuyen();
        return (int) Math.round(res);
    }
    
    public int giaBan() {
        double res = (double) (thanhTien() + (double)thanhTien() * 2 / 100) / amount;
        return (int) Math.ceil(res / 100) * 100;
    }

    @Override
    public String toString() {
        return getIdString() + " " + name + " " + calculationUnit + " " + phiVanChuyen() + " " + thanhTien() + " " + giaBan();
    }
}
public class Draft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> list = new ArrayList<>();
        
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            sc.nextLine();
            MatHang matHang = new MatHang(test, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            list.add(matHang);
        }
        
        Collections.sort(list, Comparator
                    .comparing(MatHang:: giaBan, Comparator.reverseOrder()));
        
        for (MatHang matHang : list)
                System.out.println(matHang);
    }
}
