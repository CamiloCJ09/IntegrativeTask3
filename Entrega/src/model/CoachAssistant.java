package model;

public class CoachAssistant extends Coach {
    private boolean wasPlayer;

    public CoachAssistant(boolean wasPlayer, int experienceYears, String name,
     String idNum, int salary){
        super(experienceYears,name,idNum,salary);
        this.wasPlayer = wasPlayer;
    }

    public boolean isWasPlayer() {
        return wasPlayer;
    }

    public void setWasPlayer(boolean wasPlayer) {
        this.wasPlayer = wasPlayer;
    }

}
