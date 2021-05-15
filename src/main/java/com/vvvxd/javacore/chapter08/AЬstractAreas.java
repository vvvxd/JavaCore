package main.java.com.vvvxd.javacore.chapter08;


abstract class Figure1 {
    double dim1;
    double dim2;

    Figure1(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle1 extends Figure1 {
    Rectangle1(
            double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области четырехугольника. ");
        return dim1 * dim2;
    }
}

class Triangle1 extends Figure1 {
    Triangle1(
            double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}

public class AЬstractAreas {
    public static void main(String args[]) {
        Rectangle1 r = new Rectangle1(9, 5);
        Triangle1 t = new Triangle1(10, 8);
        Figure1 figref;
        figref = r;
        System.out.println("Площадь равна " + figref.area());
        figref = t;
        System.out.println("Площадь равна " + figref.area());
    }
}
