// ZooKeeperRunner.java
import java.util.ArrayList;

public class ZooKeeperRunner {
    public static void main(String[] args) {
        // Create ArrayList to store animals
        ArrayList<Animal> zoo = new ArrayList<>();
        
        // Add different animals to the zoo
        zoo.add(new Deer("grass", false, 15.0));
        zoo.add(new Giraffe("leaves", false, 25.0));
        zoo.add(new Lion("meat", true, 20.0));
        zoo.add(new Elephant("plants", false, 60.0));
        
        // Iterate through all animals and call speak
        System.out.println("\nAll animals in the zoo are making sounds:");
        for (Animal animal : zoo) {
            System.out.print(animal.getClass().getSimpleName() + ": ");
            animal.speak();
        }
        
        System.out.println("\nDemonstrating hearTheAnimal method:");
        // Call hearTheAnimal method with specific animals
        hearTheAnimal(new Deer("grass", false, 15.0));
        hearTheAnimal(new Giraffe("leaves", false, 25.0));
        hearTheAnimal(new Lion("meat", true, 20.0));
        
        // Original code preserved
        System.out.println("\nOriginal code demonstration:");
        // Demonstrate no-arg constructor
        Deer deer = new Deer();
        deer.eat();
        // Demonstrate parameterized constructor
        Giraffe giraffe = new Giraffe("leaves", false, 25.0);
        giraffe.eat();
    }
    
    public static void hearTheAnimal(Animal currentAnimal) {
        System.out.print("Hearing a " + currentAnimal.getClass().getSimpleName() + ": ");
        currentAnimal.speak();
    }
}
