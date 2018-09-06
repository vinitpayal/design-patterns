package com.vinit.statergyPattern.fly;

import com.vinit.statergyPattern.behavior.FlyBehavior;

public class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("===Sorry!!! I don't fly =====");
    }
}
