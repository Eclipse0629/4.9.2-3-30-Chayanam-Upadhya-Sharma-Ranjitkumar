/ Elephant.java
public class Elephant extends Animal {
    // No-arg constructor
    public Elephant() {
        System.out.println("An elephant arrives.");
    }
    
    // Parameterized constructor
    public Elephant(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("An elephant arrives.");
    }
    
    public void trumpet() {
        System.out.println("The elephant trumpets");
    }
    
    @Override
    public void speak() {
        trumpet();
    }
    
    @Override
    public void eat() {
        System.out.println("The elephant is eating " + food);
    }
}
