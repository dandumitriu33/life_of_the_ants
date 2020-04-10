package com.codecool.lifeoftheants;

public abstract class Insect {
    private String location;
    private String nextStep;

    public int stepsToQueen() {
        int result;
        result = 100;
        //calculate steps to queen
        return result;
    }

    public String getLocation() {
        return location;
    }

    public abstract void setNextStep();

    public abstract void setLocation();

}
