package hm_02_second;

/**
 * Created by Helen on 05.10.16.
 */
public class MathBoat {
    public static Boat boatsCount (Boat[] boats){
        int olderBoat = boats[0].getYear();
        Boat mostOlderBoat = boats[0];
        for (int i = 0; i < boats.length; i++) {
            if(boats[i].getYear()<olderBoat){
                olderBoat = boats[i].getYear();
                mostOlderBoat = boats[i];

            }

            System.out.println((i+1)+" "+ boats[i].getYear());


        }
        System.out.println("Most elder: "+mostOlderBoat.getYear());
        return mostOlderBoat;


    }
}
