package javaoop;

import java.util.*;

class DoanhNghiep {
    private String id, name;
    private int numberOfStudent;

    public DoanhNghiep(String id, String name, int numberOfStudent) {
        this.id = id;
        this.name = name;
        this.numberOfStudent = numberOfStudent;
    }

    public String getId() {
        return id;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + numberOfStudent;
    }
}
public class DanhSachDoanhNghiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<DoanhNghiep> list = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            DoanhNghiep doanhNghiep = new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
            list.add(doanhNghiep);
        }

        Collections.sort(list, Comparator
                    .comparing(DoanhNghiep:: getNumberOfStudent, Comparator.reverseOrder())
                    .thenComparing(DoanhNghiep:: getId));

        int q = sc.nextInt();
        while (q-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for (DoanhNghiep doanhNghiep : list)
                if (doanhNghiep.getNumberOfStudent() >= a && doanhNghiep.getNumberOfStudent() <= b)
                    System.out.println(doanhNghiep);
        }
    }
}

