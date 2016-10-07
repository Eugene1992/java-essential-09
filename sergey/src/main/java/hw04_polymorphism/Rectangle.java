package hw04_polymorphism;

/**
 * Created by Serezha on 06.10.2016.
 */
public class Rectangle extends Shape {

    private double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    @Override
    public double mathArea() {
        return a * b;
    }
}
