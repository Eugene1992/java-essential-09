package hw04_polymorphism;

/**
 * Created by Serezha on 06.10.2016.
 */
public class Rhomb extends Shape{
    private double height;

    public Rhomb(double side,
                 double height) {
        super(side);
        this.height=height;
    }

    @Override
    public double mathArea() {
        return a * height;
    }
}
