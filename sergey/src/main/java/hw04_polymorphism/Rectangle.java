package hw04_polymorphism;

/**
 * Created by Serezha on 06.10.2016.
 */
public class Rectangle extends Shape {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double mathArea() {
        return a * b;
    }
}
