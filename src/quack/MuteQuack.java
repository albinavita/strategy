package quack;

public class MuteQuack implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("I'm mute");
    }
}
