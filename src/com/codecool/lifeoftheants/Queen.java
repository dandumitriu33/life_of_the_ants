package com.codecool.lifeoftheants;

public class Queen extends Insect {
    private static int mood;
    private String location;
    private String nextStep;



    public Queen(){
        super();
        this.location = "25 25";
        this.nextStep = "25 25";
        this.mood = 0;
    }

    @Override
    public void setNextStep() {
        // as this is the Queen, it does not move
    }

    @Override
    public void setLocation() {
        // not calling any method as the Queen does not move
        String[] coordinates = this.nextStep.split(" ");
        Map.placeOnMap("Q", Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
        if (mood > 0) mood--;
    }

    public static int getMood() {
        return mood;
    }

    public static void setMood(int newMood) {
        mood = newMood;
    }
}
