// Animal.java
public class Animal {
    protected String food;
    protected boolean nocturnal;
    protected double aveLifeSpan;

    // No-arg constructor
    public Animal() {
        System.out.println("An animal arrives.");
    }

    // Parameterized constructor
    public Animal(String food, boolean nocturnal, double aveLifeSpan) {
        this.food = food;
        this.nocturnal = nocturnal;
        this.aveLifeSpan = aveLifeSpan;
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }
}