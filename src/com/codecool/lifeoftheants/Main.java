package com.codecool.lifeoftheants;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map board = new Map();

        Queen queenBee = new Queen();
        queenBee.setLocation();

        Drone droneOne = new Drone(40, 10);
        droneOne.setLocation();

        Worker workerOne = new Worker(10, 40);
        workerOne.setLocation();

        Soldier soldierOne = new Soldier(20, 37);
        soldierOne.setLocation();



//        board.drawMap();


        int turn = 0;
        Scanner in = new Scanner(System.in);
        String s;
        while (turn<50) {
            System.out.println("\nEnter 1 for next turn, anything else to quit.");
            s = in.nextLine();

            if (s.equals("1")) {
                droneOne.setLocation();
                workerOne.setLocation();
                soldierOne.setLocation();

                if (turn==9) {
                    Wasp waspOne = new Wasp(40, 30);
                    waspOne.setLocation();
                    while (Map.activityFrozen) {
                        String combat;
                        System.out.println("\nEnter 1 for next turn, anything else to quit.");
                        combat = in.nextLine();
                        if (combat.equals("1")) {
                            droneOne.setLocation();
                            workerOne.setLocation();
                            soldierOne.setLocation();

                            board.drawMap();
                        }
                    }
                    waspOne=null;
                }


                board.drawMap();
                turn++;
            }
            else {
                turn = 50;
            }
        }

    }


}
