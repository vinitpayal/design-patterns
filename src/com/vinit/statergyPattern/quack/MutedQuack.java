package com.vinit.statergyPattern.quack;

import com.vinit.statergyPattern.behavior.QuackBehavior;

public class MutedQuack implements QuackBehavior {
    public void quack(){
        System.out.println("==== performing muted quack =====");
    }
}
