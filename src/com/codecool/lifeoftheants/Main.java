package com.codecool.lifeoftheants;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int WASP_SPAWN_TURN = 9;
        final int MAX_TURNS = 50;
        // generating the map
        Map board = new Map();
        // spawning ants
        Queen queenBee = new Queen();
        queenBee.setLocation();
        Drone droneOne = new Drone(40, 10);
        droneOne.setLocation();
        Worker workerOne = new Worker(10, 40);
        workerOne.setLocation();
        Soldier soldierOne = new Soldier(20, 37);
        soldierOne.setLocation();

        board.drawMap();
        // starting activity with key press for observation
        int turn = 0;
        Scanner in = new Scanner(System.in);
        String userCommand;
        while (turn<MAX_TURNS) {
            System.out.println("\nEnter 1 for next turn, anything else to quit.");
            userCommand = in.nextLine();
            // moving ants - no wasp
            if (userCommand.equals("1")) {
                droneOne.setLocation();
                workerOne.setLocation();
                soldierOne.setLocation();
                // introducing wasp and its mechanisms
                if (turn==WASP_SPAWN_TURN) {
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
                    // intent is to delete the object - set to null so garbage collector removes it
                    waspOne=null;
                }

                board.drawMap();
                turn++;
            }
            else {
                turn = MAX_TURNS;
            }
        }

    }

}
