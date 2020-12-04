package model;

//Todo: Implementar la dependencia entre la clase Club y el enum Status
import java.util.ArrayList;

public class Club {
    
    private String name; //Name of the Club
    private String nit; //ID num
    private String foundationDate; // Foundation date
    //Relations
    private ArrayList<Employee> employees;
    private Player[][] dressingRoom1;
    private Player[][] dressingRoom2;
    private Coach[][] office;
    private Team teamA;
    private Team teamB;

    public Club(String name, String nit, String creationDate){
        this.name = name;
        this.nit = nit;
        this.foundationDate = creationDate;
        employees = new ArrayList<Employee>();
        dressingRoom1 = new Player[7][7];
        dressingRoom2 = new Player[7][6];
        office = new Coach[6][6];
        teamA = new Team("A");
        teamB = new Team("B");
    }
    //Todo: Methods
    /**
     * Method that let the user add a player to the team an to the employee ArrayList
     * @param index Determinate if is from team is A or B
     * @param name  Name of the player
     * @param idNum Id of the player
     * @param salary Salary of the player
     * @param numberInShirt Number in the jersey
     * @param numberOfGoals Amount of goals
     * @return String, with a confirmation message
     */
    public String addPlayer(int index,String name, String idNum, int salary,
    String numberInShirt,int numberOfGoals, String position, double averageRating){
        String msg = "";
        Position playerPosition = Position.valueOf(position);
        //! Resolvemos si el jugador a añadir es del equipo A o B
        if(index == 1){
            Player myPlayer = new Player(name, idNum, salary, numberInShirt, numberOfGoals, playerPosition, averageRating);
            boolean booleanPlayer = teamA.addPlayer(myPlayer);
            if(booleanPlayer){
                employees.add(myPlayer);
                msg = "Jugador añadido al equipo y a la nomina de manera correcta";
            }
            else{msg = "No se ha podido añadir al jugador";}
        }else{
            Player thisPlayer = new Player(name, idNum, salary, numberInShirt, numberOfGoals, playerPosition, averageRating);
            boolean booleanPlayer = teamB.addPlayer(thisPlayer);
            if(booleanPlayer){
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
     * @param amountOfManagedTeams Amount of managed teams
     * @param wonChampionships Amount of championships that have won
     * @param coachSkills Coach skills
     * @return String, with a confirmation message
     */
    //! Main Coach 
    //Todo: Organize the skill stuff
    public String addCoach(int index,int experienceYears, String name, String idNum, int salary,
    int amountOfManagedTeams, int wonChampionships, String coachSkills){
        String msg = "";
        Skill coachSki = Skill.valueOf(coachSkills);
        if(index == 1){
            MainCoach thisCoach = new MainCoach(experienceYears, name, idNum, salary, amountOfManagedTeams, wonChampionships, coachSki);
            boolean myCoach = teamA.addCoach(thisCoach);
            if(myCoach){
                employees.add(thisCoach);
                msg = "Entrenador añadido al equipo y a la nomina de manera correcta";
            }else{msg = "No se ha podido añadir al entrenador";}
        }else{
            MainCoach thisCoach = new MainCoach(experienceYears, name, idNum, salary, amountOfManagedTeams, wonChampionships, coachSki);
            boolean myCoach = teamB.addCoach(thisCoach);
                if(myCoach){
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
     * @return String
     */
    //! Coach Assistant
    public String addCoach(int index, boolean wasPlayer, int experienceYears, String name,
    String idNum, int salary){
        String msg = "";
        
        if(index == 1){
            CoachAssistant thisCoachAssistant = new CoachAssistant(wasPlayer, experienceYears, name, idNum, salary);
            boolean booleanCoachAssistant = teamA.addCoach(thisCoachAssistant);
            if(booleanCoachAssistant){
                employees.add(thisCoachAssistant);
                msg = "Entrenador añadido al equipo y a la nomina de manera correcta";
            }else{msg = "No se ha podido añadir al entrenador";} 
        }else{
            CoachAssistant thisCoachAssistant = new CoachAssistant(wasPlayer, experienceYears, name, idNum, salary);
            boolean booleanCoachAssistant = teamB.addCoach(thisCoachAssistant);
            if(booleanCoachAssistant){
                employees.add(thisCoachAssistant);
                msg = "Entrenador añadido al equipo y a la nomina de manera correcta";
            }else{msg = "No se ha podido añadir al entrenador";} 
        }
        return msg;
    }
    public String showAllEmployeesWithIndex(){
        String msg = "";
        for(int i = 0; i < employees.size(); i++) {
            msg += "("+(i+1)+")"+employees.get(i).getName()+"\n";
        }
        return msg;
    }
    /**
     * Method that let fire an employee changing his status
     * @param index the index of the employee that we want to fire
     * @param team represents the team of the employee that we want to fire
     * @return String with a confirmation message
     */
    public String fireEmployee(int index, int team){
        String msg = "";
        index = index-1;
        String toFind = employees.get(index).getIdNum(); //! Id number of the employee that we going to fire
        if(team == 1){
            if(teamA.fireEmployee(toFind)){
                employees.get(index).setStatus(Status.INACTIVE);
                msg = "Empleado despedido con éxito";
            }else{
                msg = "No se ha podido despedir al empleado";
            }
        }else{
            if(teamB.fireEmployee(toFind)){
                employees.get(index).setStatus(Status.INACTIVE);
                msg = "Empleado despedido con éxito";
            }else{
                msg = "No se ha podido despedir al empleado";
            }
        }
        return msg;
    }
    public String showClubInfo(int index){
        String msg = "";
        if(index == 1){
            msg = teamA.showTeamInfo();
        }else if(index == 2){
            msg = teamB.showTeamInfo();
        }else{
            msg += "Team A\n";
            msg += "***************\n";
            msg += teamA.showTeamInfo();
            msg += "Dressing room team A\n";
            msg += "";
            for(int i = 0; i < dressingRoom1.length; i++){
                for(int j = 0 ; j < dressingRoom1[0].length; j++){
                    if(dressingRoom1[i][j] == null){
                        msg += "vacío\t";
                    }else{
                        msg += dressingRoom1[i][j].getName() + "\t";
                    }
                }
                msg += "\n";
            }
            msg += "Team B\n";
            msg += "***************\n";
            msg += teamB.showTeamInfo();
            msg += "Dressing room team B\n";
            for(int i = 0; i < dressingRoom2.length; i++){
                for(int j = 0 ; j < dressingRoom2[0].length; j++){
                    if(dressingRoom2[i][j] == null){
                        msg += "vacío\t";
                    }else{
                        msg += dressingRoom2[i][j].getName() + "\t";
                    }
                }
                msg += "\n";
            }
            msg += "Offices\n";
            msg += "***************\n";
            for(int i = 0; i < office.length; i++){
                for(int j = 0; j < office[0].length; j++){
                    if(office[i][j] == null){
                        msg += "vacío\t";
                    }else{
                        msg += office[i][j].getName() +"\t";
                    }
                }
                msg += "\n";
            }
        }
        return msg;
    }
    public String fillDressingRoom(){
        String msg = "";
        Player[] playersToFill1 = teamA.getPlayers();
        Player[] playersToFill2 = teamB.getPlayers();
        boolean out1 = false;
        for(int k = 0; k < playersToFill1.length; k++){
            if(playersToFill1[k] != null){
                for(int i = 0; i < dressingRoom1.length && !out1; i = i+2){
                    for(int j = 0; j < dressingRoom1[0].length && !out1; j = j+2){
                        if(dressingRoom1[i][j] == null){
                            dressingRoom1[i][j] = playersToFill1[k];
                            out1 = true;
                        }
                    }
                }
                out1 = false;
            }  
        }
        boolean out2 = false;
        for(int k = 0; k < playersToFill2.length; k++){
            if(playersToFill2[k] != null){
                for(int i = 0; i < dressingRoom2.length && !out2; i = i+2){
                    for(int j = 0; j < dressingRoom2[0].length && !out2; j = j+2){
                        if(dressingRoom2[i][j] == null){
                            dressingRoom2[i][j] = playersToFill2[k];
                            out2 = true;
                        }
                    }
                }
                out2 = false;
            }  
        }
        msg = "Camerinos llenos con éxito";
        return msg;
    }
    public String fillOffices(){
        String msg = "";
        boolean out = false;
        for(int h = 0; h < employees.size(); h++){
            if(employees.get(h) instanceof Coach){
                for(int i = 0; i < office.length && !out; i = i+2){
                    for(int j = 0; j < office[0].length && !out; j = j+2){
                        if(office[i][j] == null){
                            office[i][j] = ((Coach) employees.get(h));
                            out = true;
                        }
                    }
                }
            }
            out = false;
        }
        msg = "Oficinas llenas con éxito";
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

    public Coach[][] getOffice() {
        return office;
    }

    public void setOffice(Coach[][] office) {
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

    public Player[][] getDressingRoom1() {
        return dressingRoom1;
    }

    public void setDressingRoom1(Player[][] dressingRoom1) {
        this.dressingRoom1 = dressingRoom1;
    }

    public Player[][] getDressingRoom2() {
        return dressingRoom2;
    }

    public void setDressingRoom2(Player[][] dressingRoom2) {
        this.dressingRoom2 = dressingRoom2;
    }

}
