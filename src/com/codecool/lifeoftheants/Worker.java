package com.codecool.lifeoftheants;

public class Worker extends Insect {
    private String location;
    private String nextStep;

    public Worker(int xCoordinate, int yCoordinate) {
        super();
        this.location = xCoordinate + " " + yCoordinate;
        this.nextStep = this.location;
    }

    @Override
    public void setNextStep() {
        if (!Map.activityFrozen) {
            try {
                String[] coordinates = this.location.split(" ");
                int temp = Integer.parseInt(coordinates[0]) + Integer.parseInt(Util.getRandomDirection());
                if (Math.abs(temp) > Map.SIZE) throw new ArithmeticException("Out of map.");
                coordinates[0] = String.valueOf(temp);
                temp = Integer.parseInt(coordinates[1]) + Integer.parseInt(Util.getRandomDirection());
                if (Math.abs(temp) > Map.SIZE) throw new ArithmeticException("Out of map.");
                coordinates[1] = String.valueOf(temp);
                this.nextStep = coordinates[0] + " " + coordinates[1];
            }
            catch(ArithmeticException e) {
                this.nextStep = this.location;
            }
        }
        else {
            this.nextStep = this.location;
        }
    }

    @Override
    public void setLocation() {
        setNextStep();
        this.location = this.nextStep;
        String[] coordinates = this.location.split(" ");
        Map.placeOnMap("w", Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
    }
}
