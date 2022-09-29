//package javaoop;
//
//import java.io.*;
//import java.util.*;
//
//class ThiSinh {
//    private String id, name;
//    private float score1, score2, score3;
//
//    public ThiSinh(String id, String name, float score1, float score2, float score3) {
//        this.id = id;
//        this.name = name;
//        this.score1 = score1;
//        this.score2 = score2;
//        this.score3 = score3;
//    }
//
//    public String getId() {
//        return id;
//    }
//    
//    public String getFormattedName() {
//        String[] s = name.toLowerCase().trim().split("\\s+");
//        String res = "";
//        for (String i : s)
//            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
//        return res.substring(0, res.length()-1);
//    }
//    
//    public float priorityScore() {
//        String s = id.substring(0, 3);
//        if (s.equals("KV1"))
//            return 0.5f;
//        else if (s.equals("KV2"))
//            return 1;
//        return 2.5f;
//        
//    }
//
//    public float totalScore() {
//        return 2*score1 + score2 + score3;
//    }
//    
//    public String scoreString(float score) {
//        int temp = (int) score;
//        if (score == temp)
//            return Integer.toString(temp);
//        return Float.toString(score);
//    }
//
//    public String status() {
//        return totalScore() + priorityScore() >= 24 ? "TRUNG TUYEN" : "TRUOT";
//    }
//    
//    @Override
//    public String toString() {
//        return id + " " + getFormattedName() + " " + scoreString(priorityScore()) + " " + scoreString(totalScore()) + " " + status();
//    }
//
//}
//public class BaiTuyenSinh {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        ArrayList<ThiSinh> list = new ArrayList<>();
//        while (t-- > 0) {
//            sc.nextLine();
//            ThiSinh thiSinh = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
//            list.add(thiSinh);
//        }
////        int q = sc.nextInt();
////        
////        Collections.sort(list, new Comparator<ThiSinh>() {
////            @Override
////            public int compare(ThiSinh o1, ThiSinh o2) {
////                int comp = Float.compare(o2.totalScore(), o1.totalScore());
////                if (comp == 0) 
////                    return o1.getId().compareTo(o2.getId());
////                return comp;
////            }
////        });
////        if (q >= list.size()) q = list.size();
////        float score = list.get(q-1).totalScore();
////        for (int i = 0; i < list.size(); i++)
////            if (list.get(i).totalScore() >= score)
////                list.get(i).setStatus("TRUNG TUYEN");
////            else
////                list.get(i).setStatus("TRUOT");
////        
////        System.out.println(score);
//        for (ThiSinh thiSinh : list)
//            System.out.println(thiSinh);
//    }
//}