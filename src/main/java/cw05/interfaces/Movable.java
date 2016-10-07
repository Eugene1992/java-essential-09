package cw05.interfaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

/**
 * Created by evgeniy on 07/10/16.
 */
public interface Movable extends Serializable, Cloneable, RandomAccess{

    public static final String K = "j";

    public abstract int getDistance(int hours);

    default void defaultMethod() {

    }

    static void staticMethod() {

    }
}
