public class ZooKeeperRunner {
    public static void main(String[] args) {
        // Demonstrate no-arg constructor
        Deer deer = new Deer();
        deer.eat();

        // Demonstrate parameterized constructor
        Giraffe giraffe = new Giraffe("leaves", false, 25.0);
        giraffe.eat();
    }
}
