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
    public boolean addPlayer(Player myPlayer){
         //! Represents if the player can be created
        boolean out = false;
        for(int i = 0; i < players.length && !out; i++){
            if(players[i] == null){ //! Looking for an empty space in the array
                players[i] = myPlayer;
                out = true;
            }
        }
        return out;
    }
    
    //! Main Coach
    /**
     * 
     * @param myCoach
     * @return
     */
    public boolean addCoach(MainCoach myCoach){
        boolean answer = false;
        if(mainCoach == null){
            mainCoach = myCoach;
            answer = true;
        }
        return answer;
    }
    //! Coach Assistant
    /**
     * 
     * @param myCoachAssistant
     * @return
     */
    public boolean addCoach(CoachAssistant myCoachAssistant){
        boolean out = false;
        for(int i = 0; i < assistantsCoach.length && !out; i++){
            if(assistantsCoach[i] == null){
                assistantsCoach[i] = myCoachAssistant;
                out = true;
            }
        }
        return out;
    }
    
    /**
     * Method that let fire an employee from the team
     * @param idNum represents the ID number of the employee that we want to fire
     * @return
     */
    public boolean fireEmployee(String idNum){
        boolean answer = false;
        if(mainCoach != null){
            if(mainCoach.getIdNum().equals(idNum)){
                mainCoach = null;
                answer = true;
            }
        }
        for(int i = 0; i < assistantsCoach.length && !answer; i++){
            if(assistantsCoach[i] != null){
                if(assistantsCoach[i].getIdNum().equals(idNum)){
                    assistantsCoach[i] = null;
                    answer = true;
                }
            }
        }
        for(int i = 0; i < players.length && !answer; i++){
            if(players[i] != null){
                if(players[i].getIdNum().equals(idNum)){
                    players[i] = null;
                    answer = true;
                }
            }
        }
        return answer;
    }

    public String showTeamInfo(){
        String msg = "";
        msg += "Main Coach:\n";
        if(mainCoach != null){
            msg += mainCoach.employeeToString();
        }
        msg += "Coach assistants:\n";
        if(assistantsCoach[0] != null){
            for(int i = 0; i < assistantsCoach.length; i++){
                if(assistantsCoach[i] != null){
                    msg += "********************\n";
                    msg += assistantsCoach[i].employeeToString()+"\n";   
                }
            }
        }
        msg += "Players:\n";
        if(players != null){
            for(int i = 0; i < players.length; i++){
                if(players[i] != null){
                    msg += "********************\n";
                    msg += players[i].employeeToString()+"\n";
                }
            }
        }
        return msg;
    }
    //! Setters and getters
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
