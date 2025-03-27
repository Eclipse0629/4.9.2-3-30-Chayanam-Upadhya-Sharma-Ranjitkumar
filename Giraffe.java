
public class Giraffe extends Animal {
    // Parameterized constructor
    public Giraffe(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A giraffe arrives.");
    }

    // Override eat method to provide specific behavior
    @Override
    public void eat() {
        System.out.println("The giraffe is eating " + food);
    }
}