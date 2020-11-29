package model;

public class CoachAssistant extends Coach {
    private boolean wasPlayer;

    public CoachAssistant(boolean wasPlayer, int experienceYears, String name,
     String idNum, int salary, Status status){
        super(experienceYears,name,idNum,salary, status);
        this.wasPlayer = wasPlayer;
    }

    public boolean isWasPlayer() {
        return wasPlayer;
    }

    public void setWasPlayer(boolean wasPlayer) {
        this.wasPlayer = wasPlayer;
    }

}
