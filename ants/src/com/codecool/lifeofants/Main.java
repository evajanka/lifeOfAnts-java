package com.codecool.lifeofants;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here

        System.out.println("Pls enter the width of the grid:");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        sc.close();

        Grid grid = new Grid();
        grid.setAnts();
        grid.setTable(width);
        boolean stop = true;
        for(int i=0; i<width; i++) {
            for (Ant ant : grid.Ants) {
                ant.move();
                /*if (ant.x == 0 && ant.y == 0 && !ant.getClass().getName().equals("com.codecool.lifeofants.Queen")) {
                    stop = false;
                }*/
            }
                System.out.print("\033[H\033[2J");
                System.out.flush();
                grid.setTable(width);



        }
    }
}