package cw05.abstraction;

/**
 * Created by evgeniy on 07/10/16.
 */
public abstract class Shape {

    protected int firstSide;

    public Shape(int firstSide) {
        this.firstSide = firstSide;
    }

    public abstract int getArea();

    public void doSomething() {

    }

    public static void main(String[] args) {
        Shape shape = new Triangle(1, 2, 3);
        Shape shape1 = new Circle(1);
        System.out.println(shape.getArea());
    }
}
