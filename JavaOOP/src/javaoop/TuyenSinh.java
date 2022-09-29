//package javaoop;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.*;
//
//class ThiSinh {
//    private int idTeacher;
//    private String name, id;
//    private float score1, score2;
//
//    public ThiSinh(int idTeacher, String name, String id, float score1, float score2) {
//        this.idTeacher = idTeacher;
//        this.name = name;
//        this.id = id;
//        this.score1 = score1;
//        this.score2 = score2;
//    }
//
//    public float priorityScore() {
//        String s = id.substring(1);
//        if (s.equals("1")) return 2.0f;
//        if (s.equals("2")) return 1.5f;
//        if (s.equals("3")) return 1.0f;
//        return 0.0f;
//    }
//
//    public String getIdTeacherString() {
//        String s = "GV";
//        for (int i = 1; i < 2 - Math.log10(idTeacher); i++)
//            s += "0";
//        return s + Integer.toString(idTeacher);
//    }
//
//    public String getSubject() {
//        String s = id.substring(0, 1);
//        if (s.equals("A")) return "TOAN";
//        if (s.equals("B")) return "LY";
//        return "HOA";
//    }
//        
//    public float totalScore() {
//        return 2*score1 + score2 + priorityScore();
//    }
//    
//    public String status() {
//        return totalScore() >= 18 ? "TRUNG TUYEN" : "LOAI";
//    }
//    
//    @Override
//    public String toString() {
//        return getIdTeacherString() + " " + name + " " + getSubject() + " " + String.format("%.1f", totalScore()) + " " + status();
//    }
//
//}
//public class TuyenSinh {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        ArrayList<ThiSinh> list = new ArrayList<>();
//        for (int test = 1; test <= t; test++) {
//            sc.nextLine();
//            ThiSinh thiSinh = new ThiSinh(test, sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat());
//            list.add(thiSinh);
//        }
//        
//        Collections.sort(list, new Comparator<ThiSinh>() {
//            @Override
//            public int compare(ThiSinh o1, ThiSinh o2) {
//                if (o2.totalScore() > o1.totalScore())
//                    return 1;
//                else if (o2.totalScore() < o1.totalScore())
//                    return -1;
//                return 0;
//            }
//        });
//        
//        for (ThiSinh thiSinh : list)
//            System.out.println(thiSinh);
//    }
//}