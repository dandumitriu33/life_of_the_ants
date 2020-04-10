package com.codecool.lifeoftheants;

import java.util.Random;

public class Util {

    public static String getRandomDirection() {
        String [] arr = {"1", "0", "-1"};
        Random r = new Random();
        int randomNumber = r.nextInt(arr.length);
        return arr[randomNumber];
    }

}
