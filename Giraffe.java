// Giraffe.java
public class Giraffe extends Animal {
    // Parameterized constructor
    public Giraffe(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A giraffe arrives.");
    }
    
    // No-arg constructor
    public Giraffe() {
        System.out.println("A giraffe arrives.");
    }
    
    public void hum() {
        System.out.println("The giraffe hums");
    }
    
    @Override
    public void speak() {
        hum();
    }
    
    // Override eat method to provide specific behavior
    @Override
    public void eat() {
        System.out.println("The giraffe is eating " + food);
    }
}
