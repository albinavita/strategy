package quack;

public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("I'm squeak");
    }
}
