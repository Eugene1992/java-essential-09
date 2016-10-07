package hw_3;

/**
 * Created by Helen on 06.10.16.
 */
public class Object {
    protected String name;
    protected int side;

    public Object (String name, int side){
        this.name = name;
        this.side = side;
    }

    public void lookLike (){
        System.out.println("Object is " + name + " and has " + side + " sides");
    }
}

