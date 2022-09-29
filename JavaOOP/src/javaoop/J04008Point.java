//package javaoop;
//
//import java.util.*;
//
//class Point {
//    private double x, y;
//
//    public Point() {
//    }
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//    
//    public Point(Point p) {
//        x = p.getX();
//        y = p.getY();
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//    
//    public double distance(Point sencondPoint) {
//        double a = x-sencondPoint.x, b = y-sencondPoint.y;
//        return Math.sqrt(a*a + b*b);
//    }
//    
//    public static double distance(Point p1, Point p2) {
//        double a = p1.x-p2.x, b = p1.y-p2.y;
//        return Math.sqrt(a*a + b*b);
//    }
//
//    @Override
//    public String toString() {
//        return x + " " + y;
//    }
//    
//}
//public class J04008Point {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
//            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
//            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
//            double d1 = Point.distance(p2, p3), d2 = Point.distance(p1, p3), d3 = Point.distance(p1, p2);
//            if (d1 + d2 <= d3 || d2 + d3 <= d1 || d1 + d3 <= d2)
//                System.out.println("INVALID");
//            else {
//                double p = (d1 + d2 + d3)/2;
//                double s = Math.sqrt(p * (p-d1) * (p-d2) * (p-d3));
//                double r = d1*d2*d3/(4*s);
//                System.out.printf("%.3f\n" ,Math.PI * r * r);
//            }
//        }
//    }
//}
