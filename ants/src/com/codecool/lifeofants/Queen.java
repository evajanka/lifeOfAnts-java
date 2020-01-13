package com.codecool.lifeofants;

public class Queen extends Ant {

    public boolean isInTheMood() {
        double randomValue = Math.random()*100;
        return randomValue <= 30;
    }

    public Queen(){
        this.x = 0;
        this.y = 0;
        this.toPrint = " Q ";
    }
}
