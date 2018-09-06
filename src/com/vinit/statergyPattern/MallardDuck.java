package com.vinit.statergyPattern;


import com.vinit.statergyPattern.behavior.FlyBehavior;
import com.vinit.statergyPattern.behavior.QuackBehavior;
import com.vinit.statergyPattern.fly.FlyWithWings;
import com.vinit.statergyPattern.quack.Squeak;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Squeak();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.println("I am Mallard duck");
    }
}
