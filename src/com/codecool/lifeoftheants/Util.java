package com.codecool.lifeoftheants;

import java.util.Random;

public class Util {

    public static String getRandomDirection() {
        String [] arr = {"1", "0", "-1"};
        Random r = new Random();
        int randomNumber = r.nextInt(arr.length);
        return arr[randomNumber];
    }

    public static int randomNumberFromRange(int min, int max) {
        Random r = new Random();
        int randomNumber = r.nextInt((max - min) + 1) + min;
        return randomNumber;
    }

    public static String getRandomEdge() {
        String [] arr = {"0", "49"};
        Random r = new Random();
        int randomNumber = r.nextInt(arr.length);
        return arr[randomNumber];
    }

}
