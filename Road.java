package com.company;

import java.util.Random;

public class Road {

    int Laps = 0;

    public Road(int Laps){

        this.Laps = Laps;

    }

    public int getRoadSpecial() {

        Random ran = new Random();
        int rs = ran.nextInt(2);

        System.out.println("RoadSpecial : " + rs);

        return rs;

    }

}
