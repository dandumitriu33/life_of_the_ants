package com.codecool.lifeoftheants;

public class Main {

    public static void main(String[] args) {

        Map board = new Map();
        board.drawMap();

        Queen queenBee = new Queen();
        queenBee.setLocation();

        Drone droneOne = new Drone(40, 10);
        droneOne.setLocation();

        Worker workerOne = new Worker(10, 40);
        workerOne.setLocation();

        Soldier soldierOne = new Soldier(20, 37);
        soldierOne.setLocation();


        board.drawMap();


    }

}
