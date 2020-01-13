package com.codecool.lifeofants;

public class Drone extends Ant {

    @Override

    public void move() {

        if (Math.abs(this.x) > Math.abs(this.y)) {
            if (this.y > 0) {
                this.y -= 1;
            } else {
                this.y += 1;
            }
        } else {
            if (this.x > 0) {
                this.x -= 1;
            } else {
                this.x += 1;
            }

        }
        if(Math.abs(this.x)<=3 && Math.abs(this.y)<=3){
            this.toPrint = "Hallelujah";
        }




    }

public Drone(){
        this.toPrint=" D ";

        }
        }
