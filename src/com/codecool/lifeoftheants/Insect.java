package com.codecool.lifeoftheants;

public abstract class Insect {
    String location;
    String nextStep;

    public int stepsToQueen() {
        int result;
        result = 25;
        //calculate steps to queen
        return result;
    }

    public abstract void setNextStep();

    public abstract void setLocation();

}
