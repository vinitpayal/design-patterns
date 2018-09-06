package com.vinit.statergyPattern;


import com.vinit.statergyPattern.fly.FlyWithWings;
import com.vinit.statergyPattern.quack.Squeak;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I am Mallard duck");
    }
}
