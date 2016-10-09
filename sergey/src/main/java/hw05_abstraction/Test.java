package hw05_abstraction;

/**
 * Created by User on 10/9/2016.
 */
public class Test {
    public static void main(String[] args) {

        Shape parallelogram = new FParallelogram(5, 6);
        Shape circle = new FCircle(3);
        Shape rectangle = new FRectangle(4, 4);
        Shape rhombus = new FRhombus(4, 8);
        Shape square = new FSquare(5);
        Shape trapeze = new FTrapeze(4, 8, 10);
        Shape triangle = new FTriangle(6, 10);


        System.out.println("Shape parallelogram.getArea() = " + parallelogram.getArea());
        System.out.println("Shape circle.getArea() = " + circle.getArea());
        System.out.println("Shape rectangle.getArea() = " + rectangle.getArea());
        System.out.println("Shape rhombus.getArea() = " + rhombus.getArea());
        System.out.println("Shape square.getArea() = " + square.getArea());
        System.out.println("Shape trapeze.getArea() = " + trapeze.getArea());
        System.out.println("Shape triangle.getArea() = " + triangle.getArea());
    }
}
