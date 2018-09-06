package com.vinit.statergyPattern.quack;

import com.vinit.statergyPattern.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("====== Squeaking =======");
    }
}
