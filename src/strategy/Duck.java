package strategy;

import fly.IFlyBehaver;
import quack.IQuackBehavior;

public abstract class Duck {
    private IFlyBehaver flyBehaver;
     private IQuackBehavior quackBehavior;

     public void setFlyBehaver(IFlyBehaver flyBehaver){
         this.flyBehaver = flyBehaver;
     }
     public void setQuackBehavior(IQuackBehavior quackBehavior){
         this.quackBehavior = quackBehavior;
     }

     public void performQuack(){
         quackBehavior.quack();
     }
     public void performFly(){
         flyBehaver.fly();
     }
     public void swim(){
         System.out.println("All ducks float, even decoys!");
     }


    public abstract void display();
}
