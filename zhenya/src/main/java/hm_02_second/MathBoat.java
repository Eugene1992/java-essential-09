package hm_02_second;

/**
 * Created by Helen on 05.10.16.
 */
public class MathBoat {
    public static Boat boatsCount(Boat[] boats) {
        int olderBoat = boats[0].getYear();
        Boat mostOlderBoat = boats[0];
        for (int i = 0; i < boats.length; i++) {
            if (boats[i].getYear() < olderBoat) {
                olderBoat = boats[i].getYear();
                mostOlderBoat = boats[i];
            }
            System.out.println((i + 1) + " " + boats[i].getYear());
        }
        System.out.println("Most elder: " + mostOlderBoat.getYear());
        return mostOlderBoat;
    }

    static void sortByYear(Boat[] boats) {
        for (int i = boats.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (boats[j].getYear() < boats[j + 1].getYear()) {
                    Boat tmp = boats[j];
                    boats[j] = boats[j + 1];
                    boats[j + 1] = tmp;
                }
            }
        }
    }
}
