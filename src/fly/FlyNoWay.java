package fly;

public class FlyNoWay implements IFlyBehaver {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
