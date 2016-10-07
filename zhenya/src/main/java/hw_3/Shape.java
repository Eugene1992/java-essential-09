package hw_3;

/**
 * Created by Helen on 06.10.16.
 */
public class Shape extends Object {

    public Shape (String name, int side){
        super(name, side);
    }

    @Override
    public void lookLike() {
        System.out.println("Shape is" + name + ", wich has " + side + " sides.");
    }
}
