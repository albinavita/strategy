package strategy;

import fly.FlyNoWay;
import quack.Squeak;

public class RubberDuck extends Duck{

    public RubberDuck(){
        setFlyBehaver(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }
    @Override
    public void display() {
        System.out.println("I'm a real Rudder duck.");
    }
}
