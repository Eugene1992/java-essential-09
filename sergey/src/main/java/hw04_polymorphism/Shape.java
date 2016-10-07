package hw04_polymorphism;

/**
 * Created by Serezha on 06.10.2016.
 */
public class Shape {
    protected double a;

    //for square
    public Shape(double a) {
        this.a = a;
    }

    public double mathArea() {
        return 0;
    }

    /**
     * Main
     */
    public static void main(String[] args) {
        Shape square = new Square(10);
        Shape rectangle = new Rectangle(5, 8);
        Shape sphere = new Sphere(4);
        Shape rhomb = new Rhomb(10, 6);

        System.out.println("Shape Square has area = " + square.mathArea());
        System.out.println("Shape Rectangle has area = " + rectangle.mathArea());
        System.out.println("Shape Sphere has area = " + sphere.mathArea());
        System.out.println("Shape Rhombus has area = " + rhomb.mathArea());
    }
}
