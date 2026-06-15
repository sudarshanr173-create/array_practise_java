public class Opps2 {

    public static void main(String args[]) {

        Fish sharks = new Fish();

        sharks.eat();
        sharks.breathe();
        sharks.swims();
    }
}

// Base class
class Animals {

    String color;

    void eat() {
        System.out.println("Eat");
    }

    void breathe() {
        System.out.println("Breathe");
    }
}

// Derived class
class Fish extends Animals {

    int fins;

    void swims() {
        System.out.println("Swims in water");
    }
