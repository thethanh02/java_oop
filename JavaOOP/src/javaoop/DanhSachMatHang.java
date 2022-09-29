//package javaoop;
//
//import java.io.*;
//import java.util.*;
//
//class MatHang {
//    private String id, name;
//    private long amount, price, tax;
//    public MatHang(String id, String name, long amount, long price, long tax) {
//        this.id = id;
//        this.name = name;
//        this.amount = amount;
//        this.price = price;
//        this.tax = tax;
//    }
//
//    public long getTotalPrice() {
//        return amount * price - tax;
//    }
//
//    @Override
//    public String toString() {
//        return id + " " + name + " " + amount + " " + price + " " + tax + " " + getTotalPrice();
//    }
//}
//public class DanhSachMatHang {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        ArrayList<MatHang> list = new ArrayList<>();
//        for (int test = 1; test <= t; test++) {
//            sc.nextLine();
//            MatHang matHang = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong(), sc.nextLong());
//            list.add(matHang);
//        }
//        
//        Collections.sort(list, new Comparator<MatHang>() {
//            @Override
//            public int compare(MatHang o1, MatHang o2) {
//                return Long.compare(o2.getTotalPrice(), o1.getTotalPrice());
//            }
//        });
//        
//        for (MatHang matHang : list)
//            System.out.println(matHang);
//    }
//}
