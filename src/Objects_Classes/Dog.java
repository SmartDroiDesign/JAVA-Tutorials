package Objects_Classes;

public class Dog {

    // States
    private String breed;
    private String colour;
    private int size;

    // Constructor
    public Dog(String breed, String colour, int size) {
        this.breed = breed;
        this.colour = colour;
        this.size = size;
    }

    // Getters
    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }

    public int getSize() {
        return size;
    }

    // Behaviours
    public void bark() {
        System.out.println("Dog is barking");
    }

    public void breathe() {
        System.out.println("Dog is breathing");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void getDogInfo() {
        System.out.println("The dog's breed is: " + getBreed() + "\n" + "The dog's colour is: " + getColour() + "\n" + "The dog's size is: " + getSize());
    }
}
