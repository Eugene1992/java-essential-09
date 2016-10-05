package hm_02_second;

/**
 * Created by Helen on 05.10.16.
 */
public class Boat {

        private String name;
        private int length;
        private int maxSpeed;
        private int weight;
    private int year;

    public Boat (String name, int length, int maxSpeed, int weight, int year){
        this.name = name;
        this.length = length;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length=length;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeigth(int weight){
        this.weight = weight;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }



}


