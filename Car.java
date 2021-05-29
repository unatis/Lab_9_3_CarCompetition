package com.company;

import java.util.Random;

public class Car {

    int CurrentSpeed = 0;

    public void pushGas() {

        Random ran = new Random();
        CurrentSpeed = CurrentSpeed  + ran.nextInt(10);
        System.out.println("pushGas : " + CurrentSpeed);
    }

    public void pushBrake() {

        Random ran = new Random();

        CurrentSpeed = CurrentSpeed - ran.nextInt(10);
        System.out.println("pushBrake : " + CurrentSpeed);
    }

    public int getCurrentSpeed() {

        return CurrentSpeed;
    }

}
