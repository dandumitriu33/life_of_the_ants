package com.codecool.lifeoftheants;

public class Queen extends Insect {
    private String location;
    private String nextStep;
    private int mood;


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
    }

    public int getMood() {
        return this.mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }
}
