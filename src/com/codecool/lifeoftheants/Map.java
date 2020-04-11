package com.codecool.lifeoftheants;

import java.util.Arrays;

public class Map {
    public static boolean activityFrozen = false;
    public static final int SIZE = 50;
    public static String waspLocation = "";
    public static String[][] map;

    public Map() {
        // SIZE 50 - shrunk for visual purposes
        String[][] map = new String[50][50];
        for(String[] row : map) {
            Arrays.fill(row, ". .");
        }
        this.map = map;
    }

    public static String getWaspLocation() {
        return waspLocation;
    }

    public void drawMap() {
        for (String[] row : this.map) {
            System.out.println("");
            for (String box : row) {
                System.out.print(box);
            }
        }
    }

    public void removeFromMap (int coordinateX, int coordinateY) {
        this.map[coordinateX][coordinateY] = ". .";
    }

    public static void placeOnMap(String symbol, int coordinateX, int coordinateY) {
        map[coordinateX][coordinateY] = symbol;
    }


}
