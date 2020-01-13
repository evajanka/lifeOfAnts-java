package com.codecool.lifeofants;

public class Soldier extends Ant {

    String dir;
    @Override
    public void move(){
        switch(this.dir) {
            case "up":
                this.y += 1;
                this.dir = "right";
                break;
            case "right":
                this.x += 1;
                this.dir = "down";
                break;
            case "down":
                this.y -= 1;
                this.dir = "left";
                break;
            case "left":
                this.x -= 1;
                this.dir = "up";
                break;
        }
    }

    public Soldier(){
        this.toPrint = " S ";
        this.dir = "up";
    }
}
