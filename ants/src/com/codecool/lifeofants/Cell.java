package com.codecool.lifeofants;

import java.util.ArrayList;

public class Cell {
    public int x;
    public int y;
    int[] coordinates;
    //String toPrint = (this.getAnt() == null) ? " . " : this.getAnt().toPrint;
    String toPrint = " . ";
    public Ant ant;


    public Ant getAnt(){
        return this.ant;
    }

    public void setAnt(Ant ant){
        this.toPrint = ant.toPrint;
        this.ant = ant;
    }

    Cell(int x, int y){
        this.x = x;
        this.y = y;
        this.coordinates = new int[2];
        this.coordinates[0] = this.x;
        this.coordinates[1] = this.y;

    }
}
