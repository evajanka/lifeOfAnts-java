package com.codecool.lifeofants;

import java.util.ArrayList;
import java.util.Arrays;

public class Grid {

    public Cell[][] table;

    public ArrayList<Ant> Ants;


    public void setAnts() {
        ArrayList<Ant> ants = new ArrayList<>();
        Ant queen = new Queen();
        ants.add(queen);
        for (int i = 0; i < 2; i++) {
            Ant workers = new Worker();
            ants.add(workers);
            Ant soldiers = new Soldier();
            ants.add(soldiers);
            Ant drones = new Drone();
            ants.add(drones);

        }
        this.Ants = ants;
        //return ants;
    }


    //public Cell[][] createGrid(){
    public void setTable(int width) {

        Cell[][] table = new Cell[width][width];

        int half = (table.length - 1) / 2;
        for (int i = 0, k = half; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                Cell cell = new Cell(j - half, k);
                for (Ant ant : this.Ants) {
                    if (ant.x == cell.x && ant.y == cell.y) {
                        cell.setAnt(ant);
                    }
                    table[i][j] = cell;
                }
                System.out.print(cell.toPrint);
            }
            System.out.println();
            k--;
        }
        System.out.println("----------------------------");
        System.out.println();
        this.table = table;
        //return table;
    }

    public void printGrid() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (Cell[] cells : this.table) {
            for (Cell cell : cells) {
                System.out.print(cell.getAnt());
            }

            System.out.println();
        }

        System.out.println("---------");
        System.out.println();
    }

}
