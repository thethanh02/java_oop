//package javaoop;
//
//import java.io.*;
//import static java.lang.Math.log10;
//import java.util.*;
//
//class ThiSinh {
//    private int id;
//    private String date, time, idRoom;
//
//    public ThiSinh(int id, String date, String time, String idRoom) {
//        this.id = id;
//        this.date = date;
//        this.time = time;
//        this.idRoom = idRoom;
//    }
//    
//    public int getYear() {
//        return Integer.valueOf(date.substring(6));
//    }
//    
//    public int getMonth() {
//        return Integer.valueOf(date.substring(3, 5));
//    }
//    
//    public int getDay() {
//        return Integer.valueOf(date.substring(0, 2));
//    }
//
//    public int getHour() {
//        return Integer.valueOf(time.substring(0, 2));
//    }
//
//    public int getMinute() {
//        return Integer.valueOf(time.substring(3, 5));
//    }
//    
//    public String getIdString() {
//        String res = "C";
//        for (int i = 1; i < 3 - log10(id); i++)
//            res += "0";
//        return res + id;
//    }
//    
//    @Override
//    public String toString() {
//        return getIdString() + " " + date + " " + time + " " + idRoom;
//    }
//
//}
//public class DanhSachCaThi {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("CATHI.in"));
//        int t = sc.nextInt();
//        sc.nextLine();
//        ArrayList<ThiSinh> list = new ArrayList<>();
//        for (int test = 1; test <= t; test++) {
//            ThiSinh thiSinh = new ThiSinh(test, sc.nextLine(), sc.nextLine(), sc.nextLine());
//            list.add(thiSinh);
//        }
//        
//        Collections.sort(list, Comparator
//                .comparing(ThiSinh:: getYear)
//                .thenComparing(ThiSinh:: getMonth)
//                .thenComparing(ThiSinh:: getDay)
//                .thenComparing(ThiSinh:: getHour)
//                .thenComparing(ThiSinh:: getMinute));
//        
//        for (ThiSinh thiSinh : list)
//            System.out.println(thiSinh);
//
//    }
//}
//}