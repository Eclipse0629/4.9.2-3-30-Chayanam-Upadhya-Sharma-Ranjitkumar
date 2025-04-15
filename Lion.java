// Lion.java
public class Lion extends Animal {
    // No-arg constructor
    public Lion() {
        System.out.println("A lion arrives.");
    }
    
    // Parameterized constructor
    public Lion(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A lion arrives.");
    }
    
    public void roar() {
        System.out.println("The lion roars");
    }
    
    @Override
    public void speak() {
        roar();
    }
    
    @Override
    public void eat() {
        System.out.println("The lion is eating " + food);
    }
}
