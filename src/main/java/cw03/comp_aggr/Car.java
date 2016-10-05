package cw03.comp_aggr;

public class Car {
    private String model;
    private String color;
    private Engine engine = new Engine(2.0); // composition
    private Freshener freshener;             // aggregation

    public Car(String model, String color, Freshener freshener) {
        this.model = model;
        this.color = color;
        this.freshener = freshener;
    }

    public Engine getEngine() {
        return engine;
    }

    public void run() {
        freshener.smell();
        engine.on();
    }

    public static void main(String[] args) {
        Freshener freshener = new Freshener("Apple");
        Car car = new Car("Tesla", "Blue", freshener);
        car.run();

        System.out.println(car.getEngine());
        car = null;

//        System.out.println(car.getEngine());
        System.out.println(freshener);
    }
}

