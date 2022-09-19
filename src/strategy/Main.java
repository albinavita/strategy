package strategy;

public class Main {
    public static void main(String[] args) {
        Duck duckMallar = new MallarDuck();
        duckMallar.display();
        duckMallar.performFly();

        Duck duckRubber = new RubberDuck();
        duckRubber.display();
        duckRubber.performFly();
    }

}
