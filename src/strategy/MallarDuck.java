package strategy;

import fly.FlyWithWings;
import quack.Quack;

public class MallarDuck extends Duck{

    public MallarDuck() {
        setFlyBehaver(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
