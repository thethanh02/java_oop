//package javaoop;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.text.*;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.temporal.ChronoUnit;
//import java.util.*;
//import java.util.concurrent.TimeUnit;
//
//class NhanVien {
//    private String name, sex, dob, address, fax, dateSign;
//    private int id = 1;
//
//    public NhanVien(int id, String name, String sex, String dob, String address, String fax, String dateSign) {
//        this.id = id;
//        this.name = name;
//        this.sex = sex;
//        this.dob = dob;
//        this.address = address;
//        this.fax = fax;
//        this.dateSign = dateSign;
//    }
//    
//    public String idString() {
//        String s = "";
//        for (int i = 1; i < 5 - Math.log10(id); i++)
//            s += "0";
//        return s + Integer.toString(id);
//    }
//    
//    public long getAge() throws ParseException {
//        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
//
//        Date d1 = df.parse(dob);
//        String dateStop = df.format(new Date());
//        Date d2 = df.parse(dateStop);
//        
//        long diff = d2.getTime() - d1.getTime();
//        long res = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
//        return res;
//    }
//    
//    public long getAge2() throws ParseException {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate d1 = LocalDate.parse(dob, dtf);
//        LocalDate d2 = LocalDate.parse("29/08/2022", dtf);
//        
//        return ChronoUnit.DAYS.between(d1, d2);
//    }
//    
//    @Override
//    public String toString() {
//        return idString() + " " + name + " " + sex + " " + dob + " " + address + " " + fax + " " + dateSign;
//    }
//
//}
//
//public class DanhSachNhanVien {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        ArrayList<NhanVien> list = new ArrayList<>();
//        sc.nextLine();
//        for (int test = 1; test <= t; test++) {
//            NhanVien nhanVien = new NhanVien(test, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//            list.add(nhanVien);
//        }
//        Collections.sort(list, new Comparator<NhanVien>() {
//            @Override
//            public int compare(NhanVien o1, NhanVien o2) {
//                try {
//                    //                try {
////                    return (int) (o2.getAge() - o1.getAge());
////                } catch (ParseException ex) {
////                }
////                return 0;
//                return (int) (o2.getAge2() - o1.getAge2());
//                } catch (ParseException ex) {
//                }
//                return 0;
//            }
//        });
//        for (NhanVien nhanVien : list)
//            System.out.println(nhanVien);
//    }
//}
