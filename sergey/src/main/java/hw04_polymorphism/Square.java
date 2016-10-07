package hw04_polymorphism;

/**
 * Created by Serezha on 06.10.2016.
 */
public class Square extends Shape {

    public Square(double a) {
        super(a);
    }

    @Override
    public double mathArea() {
        return Math.pow(a, 2);
    }
}