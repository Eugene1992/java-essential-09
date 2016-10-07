package hw_3;

/**
 * Created by Helen on 06.10.16.
 */
public class Main {
    public static void main(String[] args) {
        Object circle = new Object("Circle", 0);
        Object quadrilateral_01 = new Object("Quadrilateral_01", 4);
        Object quadrilateral_02 = new Object("Quadrilateral_02", 4);
        Object rectangel = new Object("Rectangel", 3);
        Object romb = new Object("Romb", 4);
        Object square = new Object("Square", 4);

        Object[] shapes = {circle, quadrilateral_01, quadrilateral_02, rectangel, romb, square};

    nameSides(shapes);
    }
    static void nameSides(Object[] shapes){
        for (Object shape : shapes) {
            shape.lookLike();
        }

    }
}
