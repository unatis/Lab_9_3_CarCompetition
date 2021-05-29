package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Car Mercedes = new Car();
        Car BMW = new Car();
        Road road = new Road(10);

        for(int i = 0; i < road.Laps; i++){

            Mercedes.pushGas();
            BMW.pushGas();

            //Thread.sleep(2000);

            if(road.getRoadSpecial() == 1){
                Mercedes.pushBrake();
            }

            if(road.getRoadSpecial() == 1){
                BMW.pushBrake();
            }

        }

        if(BMW.getCurrentSpeed() > Mercedes.getCurrentSpeed()){

            System.out.println("BMW Current speed is: " + BMW.getCurrentSpeed() + " " + "Mercedes Current speed is " + Mercedes.getCurrentSpeed());
            System.out.println("The winner is BMW");

        }else if (BMW.getCurrentSpeed() < Mercedes.getCurrentSpeed()){

            System.out.println("BMW Current speed is: " + BMW.getCurrentSpeed() + " " + "Mercedes Current speed is " + Mercedes.getCurrentSpeed());
            System.out.println("The winner is Mercedes");

        }else{

            System.out.println("Draw");

        }


    }


}
