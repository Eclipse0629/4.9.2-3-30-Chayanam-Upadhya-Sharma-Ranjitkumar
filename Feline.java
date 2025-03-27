
public class Animal {
    // Instance variables
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

    // Common methods
    public void eat() {
        System.out.println("The animal is eating " + food);
    }
}

// Intermediate class for some animals
public class Feline extends Animal {
    // No-arg constructor
    public Feline() {
        System.out.println("A feline arrives.");
    }

    // Parameterized constructor
    public Feline(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A feline arrives.");
    }

    public void swim() {
        System.out.println("The feline is swimming.");
    }
}

// Subclasses
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
        System.out.println("The elephant trumpets!");
    }
}

public class Tiger extends Feline {
    // No-arg constructor
    public Tiger() {
        System.out.println("A tiger arrives.");
    }

    // Parameterized constructor
    public Tiger(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A tiger arrives.");
    }

    public void huntAlone() {
        System.out.println("The tiger hunts alone.");
    }
}

public class Gorilla extends Primate {
    // No-arg constructor
    public Gorilla() {
        System.out.println("A gorilla arrives.");
    }
}

public class Primate extends Animal {
    // No constructor defined, will use Animal's no-arg constructor
}

public class Giraffe extends Animal {
    // Parameterized constructor
    public Giraffe(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A giraffe arrives.");
    }
}

public class Hippo extends Animal {
    // No-arg constructor
    public Hippo() {
        System.out.println("A hippo arrives.");
    }
}

// New classes for penguins and owls
public class Penguin extends Animal {
    // No-arg constructor
    public Penguin() {
        System.out.println("A penguin arrives.");
    }

    public void fish() {
        System.out.println("The penguin is fishing.");
    }
}

public class Owl extends Animal {
    // No-arg constructor
    public Owl() {
        System.out.println("An owl arrives.");
    }

    // Parameterized constructor
    public Owl(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("An owl arrives.");
    }

    public void hunt() {
        System.out.println("The owl is hunting.");
    }
}

// Runner class
public class ZooKeeperRunner {
    public static void main(String[] args) {
        // Implicit constructor calls
        Elephant elephant = new Elephant();
        elephant.trumpet();

        Tiger tiger = new Tiger();
        tiger.swim();
        tiger.huntAlone();

        // Explicit constructor calls
        Gorilla gorilla = new Gorilla();

        Giraffe giraffe = new Giraffe("leaves", false, 25.0);
        giraffe.eat();

        Hippo hippo = new Hippo();
        hippo.eat();

        // New animals
        Penguin penguin = new Penguin();
        penguin.fish();

        Owl owl = new Owl();
        owl.hunt();

        Owl owl2 = new Owl("mice,insects", true, 4.0);
        owl2.eat();
    }
}