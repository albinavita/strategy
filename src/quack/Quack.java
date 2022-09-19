package quack;

public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("I'm quack");
    }

}
