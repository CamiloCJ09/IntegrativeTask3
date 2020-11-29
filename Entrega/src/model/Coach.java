package model;

public abstract class Coach extends Employee {
    private int experienceYears; //Years of experience

    public Coach(int experienceYears, String name, String idNum, int salary, Status status ){
        super(name, idNum, salary, status);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}
