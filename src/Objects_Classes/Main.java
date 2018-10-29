package Objects_Classes;

public class Main {

    public static void main(String[] args) {

        // Declaration -> 'sparky'
        // Instantiation -> 'new'
        // Initialization -> 'Dog();' -> default Constructor
        Dog sparky = new Dog("Husky", "black-white", 65);
        Dog lucky = new Dog("Chiwawa", "brown", 15);
//        sparky.bark();
//        sparky.breathe();
//        sparky.sleep();
        sparky.getDogInfo();
        lucky.getDogInfo();
    }
}
