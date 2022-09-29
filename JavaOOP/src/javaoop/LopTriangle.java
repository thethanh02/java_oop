package javaoop;

import java.text.DecimalFormat;
import java.util.*;

class Point {
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static Point nextPoint(Scanner sc) {
        return new Point(sc.nextDouble(), sc.nextDouble());
    }
    
    public double distance(Point sencondPoint) {
        double a = x-sencondPoint.x, b = y-sencondPoint.y;
        return Math.sqrt(a*a + b*b);
    }
    
    public static double distance(Point p1, Point p2) {
        double a = p1.x-p2.x, b = p1.y-p2.y;
        return Math.sqrt(a*a + b*b);
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
    
}
class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean valid() {
        double d1 = Point.distance(b, c), d2 = Point.distance(a, c), d3 = Point.distance(a, b);
        return !(d1 + d2 <= d3 || d2 + d3 <= d1 || d1 + d3 <= d2);
    }
    
    public String getPerimeter() {
        DecimalFormat df = new DecimalFormat(".000");
        double d1 = Point.distance(b, c), d2 = Point.distance(a, c), d3 = Point.distance(a, b);
        return df.format(d1 + d2 + d3);
    }
}
public class LopTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
