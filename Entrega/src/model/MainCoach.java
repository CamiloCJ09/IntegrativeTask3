package model;

public class MainCoach extends Coach{
    private int amountOfManagedTeams; // Amount of teams that he has managed
    private int wonChampionships; //Amount of championship that he have won
    private Skill coachSkills; // Skills from the coach

    public MainCoach(int experienceYears, String name, String idNum, int salary, Status status,
            int amountOfManagedTeams, int wonChampionships, Skill coachSkills) {
        super(experienceYears, name, idNum, salary, status);
        this.amountOfManagedTeams = amountOfManagedTeams;
        this.wonChampionships = wonChampionships;
        this.coachSkills = coachSkills;
    }

    public int getAmountOfManagedTeams() {
        return amountOfManagedTeams;
    }

    public void setAmountOfManagedTeams(int amountOfManagedTeams) {
        this.amountOfManagedTeams = amountOfManagedTeams;
    }

    public int getWonChampionships() {
        return wonChampionships;
    }

    public void setWonChampionships(int wonChampionships) {
        this.wonChampionships = wonChampionships;
    }

    public Skill getCoachSkills() {
        return coachSkills;
    }

    public void setCoachSkills(Skill coachSkills) {
        this.coachSkills = coachSkills;
    }

    
}
