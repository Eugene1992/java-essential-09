package cw05.abstraction;

import cw05.abstraction.Shape;

/**
 * Created by evgeniy on 07/10/16.
 */
public class Triangle extends Shape {

    private int secondSide;
    private int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        super(firstSide);
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public int getArea() {
        return 10;
    }
}
