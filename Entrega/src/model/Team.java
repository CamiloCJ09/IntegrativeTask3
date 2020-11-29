package model;

import java.util.ArrayList;

public class Team {
    
    private String name; //Name of the club
    //Relations
    private MainCoach mainCoach; // Main coach
    private CoachAssistant[] assistantsCoach; // Assistant coaches
    private ArrayList<LineUp> lineUp; //Arraylist of lineUps
    private Player[] players; // Arraylist of players
    //Builder of the class team
    public Team(String name){
        this.name = name;
        assistantsCoach = new CoachAssistant[3];
        lineUp = new ArrayList<LineUp>();
        players = new Player[25];
    }
    //Todo: Methods
    /**
     * Method that creates a player
     * @param name Name of player
     * @param idNum ID number
     * @param salary Salary
     * @param status Status
     * @param numberInShirt Jersey number
     * @param numberOfGoals Amount of goals
     * @return boolean, that represents if the player has been created
     */
    public Player addPlayer(String name, String idNum, int salary, Status status,
    String numberInShirt,int numberOfGoals){
        Player answer = null; //! Represents if the player can be created
        boolean out = false;
        for(int i = 0; i < players.length && !out; i++){
            if(players[i] == null){ //! Looking for an empty space in the array
                players[i] = new Player(name, idNum, salary, status, numberInShirt, numberOfGoals);
                answer = players[i];
                out = true;
            }
        }
        return answer;
    }
    //! Main Coach
    /**
     * Method that create a Main Coach
     * @param experienceYears Amount of experience years
     * @param name Name of the coach
     * @param idNum Id of the coach
     * @param salary Salary of the coach
     * @param status Status from the employee
     * @param amountOfManagedTeams Amount of managed teams
     * @param wonChampionships Amount of championships that have won
     * @param coachSkills Coach skills
     * @return, with the player if is been created
     */
    public Coach addCoach(int experienceYears, String name, String idNum, int salary, Status status,
    int amountOfManagedTeams, int wonChampionships, Skill coachSkills){
        Coach myCoach = null;
        if(mainCoach.equals(null)){
            myCoach = new MainCoach(experienceYears, name, idNum, salary, status, amountOfManagedTeams, wonChampionships, coachSkills);
        }
        return myCoach;
    }
    //! Coach Assistant
    public Coach addCoach(boolean wasPlayer, int experienceYears, String name,
    String idNum, int salary, Status status){
        CoachAssistant myCoach = null;
        boolean out = false;
        for(int i = 0; i < assistantsCoach.length && !out; i++){
            if(assistantsCoach[i].equals(null)){
                myCoach = new CoachAssistant(wasPlayer, experienceYears, name, idNum, salary, status);
                assistantsCoach[i] = myCoach;
                out = true;
            }
        }
        return myCoach;
    }
    //Setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MainCoach getMainCoach() {
        return mainCoach;
    }

    public void setMainCoach(MainCoach mainCoach) {
        this.mainCoach = mainCoach;
    }

    public CoachAssistant[] getAssistantsCoach() {
        return assistantsCoach;
    }

    public void setAssistantsCoach(CoachAssistant[] assistantsCoach) {
        this.assistantsCoach = assistantsCoach;
    }

    public ArrayList<LineUp> getLineUp() {
        return lineUp;
    }

    public void setLineUp(ArrayList<LineUp> lineUp) {
        this.lineUp = lineUp;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
    
}
