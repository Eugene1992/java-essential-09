package hw04_polymorphism;

/**
 * Created by Serezha on 06.10.2016.
 */
public class Sphere extends Shape {

    public Sphere(double a) {
        super(a);
    }

    @Override
    public double mathArea() {
        return Math.PI * Math.pow(a, 2);
    }
}
