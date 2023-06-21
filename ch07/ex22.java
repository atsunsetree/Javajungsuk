package ch07;

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}

class Circle extends Shape {
    double r;

    public Circle(double r) {
        this(new Point(0, 0), r);
    }

    public Circle(Point p, double r) {
        super(p);
        this.r = r;
    }

    @Override
    double calcArea() {
        return Math.PI * r * r;
    }

}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this(new Point(0,0), width, height);
    }

    public Rectangle(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    public boolean isSquare() {
        return width == height ? true : false;
    }

    @Override
    double calcArea() {
        return width * height;
    }

}

public class ex22 {
    public static void main(String[] args) {
        Point p = new Point(1,1);
        Rectangle r = new Rectangle(p, 4, 4);
        System.out.println(r.p);
        System.out.println(r.isSquare());
    }
}
