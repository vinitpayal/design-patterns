package com.vinit.statergyPattern.quack;

import com.vinit.statergyPattern.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("=== Yo!! Quacking =====");
    }
}
