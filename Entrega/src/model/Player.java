package model;
//Todo: Añadir Implements profitable
public class Player extends Employee{
    private String numberInShirt;
    private double averageRating;
    private int numberOfGoals;

    public Player(String name, String idNum, int salary,
     String numberInShirt,int numberOfGoals) {
        super(name, idNum, salary);
        this.numberInShirt = numberInShirt;
        this.averageRating = 0.0;
        this.numberOfGoals = numberOfGoals;
    }
    /**
     * Method that show the information of each player
     * @return
     */
    public String playerToString(){
        String msg = super.employeeToString();
        msg += "Number in shirt: "+numberInShirt+"\n"+
                "Average rating: "+averageRating+"\n"+
                "Amount of goals: "+numberOfGoals+"\n";
        return msg;
    }
    public String getNumberInShirt() {
        return numberInShirt;
    }

    public void setNumberInShirt(String numberInShirt) {
        this.numberInShirt = numberInShirt;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

}
