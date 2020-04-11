package com.codecool.lifeoftheants;

public class Drone extends Insect {
    private String location;
    private String queenLocation = "25 25"; // change to modifiable?
    private String nextStep;
    private int onHold = 0;

    public Drone(int xCoordinate, int yCoordinate) {
        super();
        this.location = xCoordinate + " " + yCoordinate;
        this.nextStep = this.location;
    }


    @Override
    public void setNextStep() {
        if (!Map.activityFrozen || this.onHold == 0) {
            String[] queenCoordinates = queenLocation.split(" ");
            String[] droneCoordinates = this.location.split(" ");
            int queenX = Integer.parseInt(queenCoordinates[0]);
            int queenY = Integer.parseInt(queenCoordinates[1]);
            int droneX = Integer.parseInt(droneCoordinates[0]);
            int droneY = Integer.parseInt(droneCoordinates[1]);
            int nextX;
            int nextY;
            if (queenX == droneX && queenY == droneY) {
                if (Queen.getMood() > 0) {
                    throwDrone();
                }
                else {
                    System.out.println(this + " says: HALLELUJAH");
                    this.onHold = 10;
                    int newMood = Util.randomNumberFromRange(25, 50);
                    Queen.setMood(newMood);
                }
            }
            if (queenX >= droneX && queenY >= droneY) {
                if (droneX == queenX) nextX = droneX;
                else nextX = droneX + 1;
                if (droneY == queenY) nextY = droneY;
                else nextY = droneY + 1;
                this.nextStep = nextX + " " + nextY;
            } else if (queenX < droneX && queenY < droneY) {
                nextX = droneX - 1;
                nextY = droneY - 1;
                this.nextStep = nextX + " " + nextY;
            } else if (queenX >= droneX && queenY < droneY) {
                if (droneX == queenX) nextX = droneX;
                else nextX = droneX + 1;
                nextY = droneY - 1;
                this.nextStep = nextX + " " + nextY;
            } else if (queenX < droneX && queenY >= droneY) {
                nextX = droneX - 1;
                if (droneY == queenY) nextY = droneY;
                else nextY = droneY + 1;
                this.nextStep = nextX + " " + nextY;
            }
        }
        else {
            this.nextStep = this.location;
        }
    }

    private void throwDrone() {
        int landingX;
        int landingY;
        int horizontal = Integer.parseInt(Util.getRandomEdge());
        if (horizontal>0) {
            landingX = Integer.parseInt(Util.getRandomEdge());
            landingY = Util.randomNumberFromRange(0, 25);
        }
        else {
            landingY = Integer.parseInt(Util.getRandomEdge());
            landingX = Util.randomNumberFromRange(0, 25);
        }
        this.nextStep = landingX + " " + landingY;
    }

    @Override
    public void setLocation() {
        if (onHold > 0) onHold--;
        setNextStep();
        this.location = this.nextStep;
        String[] coordinates = this.nextStep.split(" ");
        Map.placeOnMap("D", Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));

    }
}
