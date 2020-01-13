package com.codecool.lifeofants;

import java.util.Random;

public abstract class Ant {
    protected int x;
    protected int y;
    protected int[] coordinates = new int[2];
    protected String toPrint;
    public void move(){};
    public Cell cell;

    public Ant(){
        int length = 5;
        Random random = new Random();
        this.x = random.nextInt((length - -length) + 1) + -length;
        this.y = random.nextInt((length - -length) + 1) + -length;
        this.coordinates[0]= this.x;
        this.coordinates[1]= this.y;

    }
}
