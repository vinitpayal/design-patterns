package com.vinit.statergyPattern;

import com.vinit.statergyPattern.behavior.FlyBehavior;
import com.vinit.statergyPattern.behavior.QuackBehavior;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void display(){
        System.out.println("display function from duck class");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
