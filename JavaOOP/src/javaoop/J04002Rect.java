//package javaoop;
//
//import java.util.*;
//
//class Rectange {
//    private double height, width;
//    private String color;
//
//    public Rectange() {
//        this.width = this.height = 1;
//    }
//
//    public Rectange(double height, double width, String color) {
//        this.width = width;
//        this.height = height;
//        this.color = color;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    public String getColor() {
//        String res = color.toLowerCase();
//        res = res.substring(0, 1).toUpperCase() + res.substring(1);
//        return res;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//    
//    public double findArea() {
//        return width * height;
//    }
//    
//    public double findPeimeter() {
//        return 2*(width + height);
//    }
//}
//public class J04002Rect {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Rectange rect = new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
//        if (rect.getHeight() <= 0 || rect.getWidth() <= 0)
//            System.out.println("INVALID");
//        else
//            System.out.printf("%.0f %.0f %s" ,rect.findPeimeter(), rect.findArea(), rect.getColor());
//    }
//}
