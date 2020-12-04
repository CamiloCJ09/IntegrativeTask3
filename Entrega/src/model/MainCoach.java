package model;

public class MainCoach extends Coach implements Profitable {
    private int amountOfManagedTeams; // Amount of teams that he has managed
    private int wonChampionships; // Amount of championship that he have won
    private Skill coachSkills; // Skills from the coach

    public MainCoach(int experienceYears, String name, String idNum, int salary, int amountOfManagedTeams,
            int wonChampionships, Skill coachSkills) {
        super(experienceYears, name, idNum, salary);
        this.amountOfManagedTeams = amountOfManagedTeams;
        this.wonChampionships = wonChampionships;
        this.coachSkills = coachSkills;
    }

    @Override
    public String employeeToString() {
        String msg = super.employeeToString();
        msg += "Amount of managed teams: " + amountOfManagedTeams + "\n" + "Amount of won championship: "
                + wonChampionships + "\n" + "Coach Skill: " + coachSkills.toString() + "\n" +"Marker price: " +
                calculateMarketPrice() + "\n" + "Stars: " + calculateStars();
        return msg;
    }
    
    public double calculateMarketPrice() {
        double marketPrice = (getSalary()*10)+(getExperienceYears()*100)+(wonChampionships*50);
        return marketPrice;
    }

    
    public double calculateStars() {
        double stars = (5+(wonChampionships/10));
        return stars;
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
