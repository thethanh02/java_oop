//package javaoop;
//
//import java.io.*;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.time.temporal.ChronoUnit;
//import java.util.*;
//
//class ThiSinh {
//    private String name, start, end;
//
//    public ThiSinh(String name, String start, String end) {
//        this.name = name;
//        this.start = start;
//        this.end = end;
//    }
//    
//    public long getDiffTime() {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//        LocalDateTime d1 = LocalDateTime.parse(start, dtf);
//        LocalDateTime d2 = LocalDateTime.parse(end, dtf);
//        return ChronoUnit.MINUTES.between(d1, d2);
//    }
//    
//    @Override
//    public String toString() {
//        return name + " " + getDiffTime();
//    }
//}
//public class Online {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("ONLINE.in"));
//        ArrayList<ThiSinh> list = new ArrayList<>();
//        
//        int t = sc.nextInt();
//        sc.nextLine();
//        for (int test = 1; test <= t; test++) {
//            ThiSinh thiSinh = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextLine());
//            list.add(thiSinh);
//        }
//        
//        Collections.sort(list, Comparator
//                .comparing(ThiSinh:: getDiffTime, Comparator.reverseOrder()));
//        
//        for (ThiSinh thiSinh : list)
//            System.out.println(thiSinh);
//
//    }
//}