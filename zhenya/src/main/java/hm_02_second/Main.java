package hm_02_second;

/**
 * Created by Helen on 05.10.16.
 */
public class Main {
    public static void main(String[] args) {
        Boat boat1 = new Boat("S.Maria", 25, 4, 1, 1460 );
        Boat boat2 = new Boat("HMS Queen", 4, 5, 3, 1839);
        Boat boat3 = new Boat("Old Ironsides", 5, 6, 3, 1797);

        Boat[] boats = {boat1, boat2, boat3};
MathBoat grandPa = new MathBoat();

        grandPa.boatsCount(boats).getYear();
    }


}
