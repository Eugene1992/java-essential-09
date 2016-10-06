package cw04.polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 2);
        Animal barsik = new Cat("Barsik", 2);
        Animal murka = new Cat("Murka", 2);
        Animal dog = new Dog("Rex", 3);
        Animal duck = new Duck("Ducky", 1);
        Animal bird = new Bird("Bird", 2);

       Animal[] animals = {animal, barsik, murka, dog, duck, bird};
       makeVoicesWithoutPoly(animals);
    }

    static void makeVoices(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }

    static void makeVoicesWithoutPoly(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.makeVoice();
            }
        }
    }

    static void makeVoices(Cat[] cats, Dog[] dogs, Duck[] ducks) {
        for (Cat cat : cats) {
            cat.makeVoice();
        }
        for (Dog dog : dogs) {
            dog.makeVoice();
        }
        for (Duck duck : ducks) {
            duck.makeVoice();
        }
    }
}
