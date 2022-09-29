//package javaoop;
//
//import java.util.*;
//
//class PhanSo {
//    private long tuSo, mauSo;
//
//    public PhanSo() {
//        this.tuSo = this.mauSo = 1;
//    }
//
//    public PhanSo(long tuSo, long mauSo) {
//        this.tuSo = tuSo;
//        this.mauSo = mauSo;
//    }
//
//    public long getTuSo() {
//        return tuSo;
//    }
//
//    public long getMauSo() {
//        return mauSo;
//    }
//    
//    public long gcd(long a, long b) {
//        if (a == 0) return b;
//        return gcd(b%a, a);
//    }
//
//    public PhanSo rutGon() {
//        long temp = gcd(tuSo, mauSo);
//        return new PhanSo(tuSo/temp, mauSo/temp);
//    }
//    
//    public static PhanSo add(PhanSo a, PhanSo b) {
//        return new PhanSo(a.getTuSo()*b.getMauSo() + b.getTuSo()*a.getMauSo(), a.getMauSo() * b.getMauSo()).rutGon();
//    }
//    
//    public static PhanSo mul(PhanSo a, PhanSo b) {
//        return new PhanSo(a.getTuSo()*b.getTuSo(), a.getMauSo()*b.getMauSo()).rutGon();
//    }
//
//    @Override
//    public String toString() {
//        PhanSo res = this.rutGon();
//        return res.tuSo + "/" + res.mauSo;
//    }
//}
//public class J04004PhanSo {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
//            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
//            PhanSo temp = PhanSo.add(a, b);
//            PhanSo c = PhanSo.mul(temp, temp);
//            System.out.println(c + " " + PhanSo.mul(c, PhanSo.mul(a, b)));
//        }
//    }
//}
