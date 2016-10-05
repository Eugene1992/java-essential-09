package hw_1;

/**
 * Created by Helen on 03.10.16.
 */
public class Hw_1 {
    public static void main(String[] args) {
        NameAgeSex persone1 = new NameAgeSex();
        persone1.name = "Margharet";
        persone1.car = "Volvo";
        persone1.income = 8000;

        NameAgeSex persone2 = new NameAgeSex();
        persone2.name = "Donald";
        persone2.car = "Rang Rover";
        persone2.income = 9000;

        NameAgeSex persone3 = new NameAgeSex();
        persone3.name = "Tom";
        persone3.car = "BMW";
        persone3.income = 10000;

        NameAgeSex persone4 = new NameAgeSex();
        persone4.name = "Sam";
        persone4.car = "Cadilac";
        persone4.income = 7000;

        NameAgeSex[] people = {persone1, persone2, persone3, persone4};


        System.out.println(sdr(people).name + " have a " + sdr(people).car);
        System.out.println(older(people).name + " - " + older(people).age);

    }

    static NameAgeSex sdr(NameAgeSex[] people) {
        int minAge = people[0].age;
        NameAgeSex minAges = people[0];
        for (int i = 0; i < people.length; i++) {
            if (people[i].age < minAge) {
                minAge = people[i].age;
                minAges = people[i];
            }


        }
        return minAges;
    }

    static NameAgeSex older(NameAgeSex[] someone) {
        int maxAge = someone[0].age;
        NameAgeSex maxAges = someone[0];
        for (int i = 0; i < someone.length; i++) {
            if (someone[i].age > maxAge) {
                maxAge = someone[i].age;
                maxAges = someone[i];
            }


        }
        return maxAges;
    }
}
