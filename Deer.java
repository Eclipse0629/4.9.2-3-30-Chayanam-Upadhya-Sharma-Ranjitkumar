public class Deer extends Animal {
    // No-arg constructor
    public Deer() {
        System.out.println("A deer arrives.");
    }

    // Parameterized constructor
    public Deer(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A deer arrives.");
    }
}