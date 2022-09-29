//package javaoop;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.text.*;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.temporal.ChronoUnit;
//import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//class NhanVien {
//    private int idCustomer;
//    private String name, idRoom, dateArrive, dateLeave;
//
//    public NhanVien(int idCustomer, String name, String idRoom, String dateArrive, String dateLeave) {
//        this.idCustomer = idCustomer;
//        this.name = name;
//        this.idRoom = idRoom;
//        this.dateArrive = dateArrive;
//        this.dateLeave = dateLeave;
//    }
//    
//    public String idString() {
//        String s = "KH";
//        for (int i = 1; i < 2 - Math.log10(idCustomer); i++)
//            s += "0";
//        return s + Integer.toString(idCustomer);
//    }
//    
//    public long getDiffDate() {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate d1 = LocalDate.parse(dateArrive, dtf);
//        LocalDate d2 = LocalDate.parse(dateLeave, dtf);
//        return ChronoUnit.DAYS.between(d1, d2);
//    }
//    
//    @Override
//    public String toString() {
//        return idString() + " " + name + " " + idRoom + " " + getDiffDate();
//    }
//
//}
//
//public class DanhSachLuuTru {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("KHACH.in"));
//        int t = sc.nextInt();
//        ArrayList<NhanVien> list = new ArrayList<>();
//        sc.nextLine();
//        for (int test = 1; test <= t; test++) {
//            NhanVien nhanVien = new NhanVien(test, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//            list.add(nhanVien);
//        }
//        Collections.sort(list, new Comparator<NhanVien>() {
//            @Override
//            public int compare(NhanVien o1, NhanVien o2) {
//                return (int) (o2.getDiffDate()-o1.getDiffDate());
//            }
//        });
//        for (NhanVien nhanVien : list)
//            System.out.println(nhanVien);
//    }
//}
