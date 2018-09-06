package com.vinit;

import com.vinit.statergyPattern.MallardDuck;
import com.vinit.statergyPattern.fly.NoFly;
import com.vinit.statergyPattern.quack.MutedQuack;

public class Main {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        mallardDuck.setFlyBehavior(new NoFly());
        mallardDuck.setQuackBehavior(new MutedQuack());

        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}

