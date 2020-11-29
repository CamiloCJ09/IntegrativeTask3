package model;

//Todo: Implementar la dependencia entre la clase Club y el enum Status
import java.util.ArrayList;

public class Club {
    
    private String name; //Name of the Club
    private String nit; //ID num
    private String foundationDate; // Foundation date
    //Relations
    private ArrayList<Employee> employees;
    private DressingRoom[][] dressingRoom;
    private Office[][] office;
    private Team teamA;
    private Team teamB;

    public Club(String name, String nit, String creationDate){
        this.name = name;
        this.nit = nit;
        this.foundationDate = creationDate;
        employees = new ArrayList<Employee>();
        dressingRoom = new DressingRoom[7][7];
        office = new Office[6][6];
    }
    //Todo: Methods
    /**
     * Method that let the user add a player to the team an to the employee ArrayList
     * @param index Determinate if is from team is A or B
     * @param name  Name of the player
     * @param idNum Id of the player
     * @param salary Salary of the player
     * @param status Status of the employee
     * @param numberInShirt Number in the jersey
     * @param numberOfGoals Amount of goals
     * @return String, with a confirmation message
     */
    public String addPlayer(int index,String name, String idNum, int salary, int status,
    String numberInShirt,int numberOfGoals){
        Status playerStatus; //! Variable donde guardamos si el player es activo o no
        String msg = "";
        //! Obteniendo si el empleado, en este caso jugador está activo
        if(status == 1){playerStatus = Status.ACTIVE;}
        else{playerStatus = Status.INACTIVE;}
        //! Resolvemos si el jugador a añadir es del equipo A o B
        if(index == 1){
            Player thisPlayer = teamA.addPlayer(name, idNum, salary, playerStatus, numberInShirt, numberOfGoals);
            if(!thisPlayer.equals(null)){
                employees.add(thisPlayer);
                msg = "Jugador añadido al equipo y a la nomina de manera correcta";
            }
            else{msg = "No se ha podido añadir al jugador";}
        }else{
            Player thisPlayer = teamB.addPlayer(name, idNum, salary, playerStatus, numberInShirt, numberOfGoals);
            if(!thisPlayer.equals(null)){
                employees.add(thisPlayer);
                msg = "Jugador añadido al equipo y a la nomina de manera correcta";
            }
            else{msg = "No se ha podido añadir al jugador";}
        }
        return msg;
    }
    
    /** 
     * Method that let create a main coach
     * @param index Determinate if is from team A or B
     * @param experienceYears Amount of experience years
     * @param name Name of the coach
     * @param idNum Id of the coach
     * @param salary Salary of the coach
     * @param status Status from the employee
     * @param amountOfManagedTeams Amount of managed teams
     * @param wonChampionships Amount of championships that have won
     * @param coachSkills Coach skills
     * @return String, with a confirmation message
     */
    //! Main Coach 
    //Todo: Organize the skill stuff
    public String addCoach(int index,int experienceYears, String name, String idNum, int salary, int status,
    int amountOfManagedTeams, int wonChampionships, Skill coachSkills){
        Status coachStatus;
        String msg = "";
        if(status == 1){coachStatus = Status.ACTIVE;}
        else{coachStatus = Status.INACTIVE;}
        if(index == 1){
            Coach thisCoach = teamA.addCoach(experienceYears, name, idNum, salary, coachStatus, amountOfManagedTeams, wonChampionships, coachSkills);
            if(!thisCoach.equals(null)){
                employees.add(thisCoach);
                msg = "Entrenador añadido al equipo y a la nomina de manera correcta";
            }else{msg = "No se ha podido añadir al entrenador";}
        }else{
            Coach thisCoach = teamB.addCoach(experienceYears, name, idNum, salary, coachStatus, amountOfManagedTeams, wonChampionships, coachSkills);
            if(!thisCoach.equals(null)){
                employees.add(thisCoach);
                msg = "Entrenador añadido al equipo y a la nomina de manera correcta";
            }else{msg = "No se ha podido añadir al entrenador";}
        }
        return msg;
    }
    
    /** 
     * Method that let create a coach assistant
     * @param index Determinate if is from Team A or B
     * @param wasPlayer Let know if was player
     * @param experienceYears Amount of experience years
     * @param name Name of the coach
     * @param idNum Id of the coach
     * @param salary Salary of the coach
     * @param status Status of the employee
     * @return String
     */
    //! Coach Assistant
    public String addCoach(int index,boolean wasPlayer, int experienceYears, String name,
    String idNum, int salary, int status){
        Status coachStatus;
        String msg = "";
        if(status == 1){coachStatus = Status.ACTIVE;}
        else{coachStatus = Status.INACTIVE;}
        if(index == 1){

        }
        return msg;
    }

    //! Setters and getters
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(String foundationDate) {
        this.foundationDate = foundationDate;
    }

    public DressingRoom[][] getDressingRoom() {
        return dressingRoom;
    }

    public void setDressingRoom(DressingRoom[][] dressingRoom) {
        this.dressingRoom = dressingRoom;
    }

    public Office[][] getOffice() {
        return office;
    }

    public void setOffice(Office[][] office) {
        this.office = office;
    }

    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

}
