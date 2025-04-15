// Deer.java
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
    
    public void grunt() {
        System.out.println("The deer grunts");
    }
    
    @Override
    public void speak() {
        grunt();
    }
    
    @Override
    public void eat() {
        System.out.println("The deer is eating " + food);
    }
}
