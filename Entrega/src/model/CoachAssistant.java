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
    /**
     * return String
     */
    @Override
    public String employeeToString() {
        String msg = super.employeeToString();
        if(wasPlayer){
            msg += "Was player: Yes";
        }else{
            msg += "Was Player: No";
        }
        return msg;
    }

}
