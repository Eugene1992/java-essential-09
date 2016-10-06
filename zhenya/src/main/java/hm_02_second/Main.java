package hm_02_second;

/**
 * Created by Helen on 05.10.16.
 */
public class Main {
    public static void main(String[] args) {
        Boat boat1 = new Boat("S.Maria", 25, 4, 1, 1460 );
        Boat boat2 = new Boat("HMS Queen", 4, 5, 3, 1839);
        Boat boat3 = new Boat("Old Ironsides", 5, 6, 3, 1797);
        Boat boat4 = new Boat("Titanik", 5, 6, 3, 1912);
        Boat boat5 = new Boat("Black pearl", 5, 6, 3, 1623);

        Boat[] boats = {boat1, boat2, boat3, boat4, boat5};
        MathBoat grandPa = new MathBoat();

        for (Boat boat : boats) {
            System.out.print("[" + boat.getYear() + "]");
        }
        MathBoat.sortByYear(boats);
        System.out.println();
        for (Boat boat : boats) {
            System.out.print("[" + boat.getYear() + "]");
        }
    }
}
