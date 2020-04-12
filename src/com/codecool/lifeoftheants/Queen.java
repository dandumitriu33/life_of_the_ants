package com.codecool.lifeoftheants;

public class Queen extends Insect {
    private static int mood;

    public Queen(){
        super();
        final String QUEEN_SPAWN = "25 25";
        this.location = QUEEN_SPAWN;
        this.mood = 0;
        Map.queenLocation = this.location;
    }

    @Override
    public void setNextStep() {
        // as this is the Queen, it does not move
    }

    @Override
    public void setLocation() {
        // not calling setNextStep() as the Queen does not move
        String[] coordinates = this.location.split(" ");
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
