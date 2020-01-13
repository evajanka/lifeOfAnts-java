package com.codecool.lifeofants;

import java.util.ArrayList;
import java.util.Random;

public class Worker extends Ant {

    @Override
    public void move(){
        Random random = new Random();
        int[] steps = new int[] {1, 2, 3, 4};
        int pick = steps[random.nextInt(steps.length)];
        switch(pick){
            case 1:
                this.x+=1;
                break;
            case 2:
                this.y+=1;
                break;
            case 3:
                this.x-=1;
                break;
            case 4:
                this.y-=1;
                break;
        }
    }

    public Worker(){
        this.toPrint = " W ";

    }
}
