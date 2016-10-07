package hw04_polymorphism;

/**
 * Created by Serezha on 06.10.2016.
 */
public class Rhomb extends Shape {
    public Rhomb(double side, double height) {
        super(side, height);
    }

    @Override
    public double mathArea() {
        return 0.5 * a * b;
    }
}
