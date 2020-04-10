package com.codecool.lifeoftheants;

public class Queen extends Insect {
    private static int mood;
    private String location;
    private String nextStep;



    public Queen(){
        super();
        this.location = "0 0";
        this.nextStep = "0 0";
        this.mood = 0;
    }

    @Override
    public void setNextStep() {
        // as this is the Queen, it does not move
    }

    @Override
    public void setLocation() {
        // not calling any method as the Queen does not move
        if (mood > 0) mood--;
    }

    public static int getMood() {
        return mood;
    }

    public static void setMood(int newMood) {
        mood = newMood;
    }
}
