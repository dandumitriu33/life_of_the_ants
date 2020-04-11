package com.codecool.lifeoftheants;

public class Wasp extends Insect {
    private String location;
    private String nextStep;

    public Wasp(int coordinateX, int coordinateY){
        super();
        this.location = coordinateX + " " + coordinateY;
        this.nextStep = coordinateX + " " + coordinateY;
        Map.activityFrozen = true;
        Map.waspLocation = this.location;
    }

    @Override
    public void setNextStep() {
        this.nextStep = this.location;
    }

    @Override
    public void setLocation() {
        // the wasp doesn't move - maybe remove this step to save processing power
        // or keep to make this setLocation function default DRY
        setNextStep();
        this.location = this.nextStep;
    }


}
