package model;
//Todo: Añadir Implements profitable
public class Player extends Employee{
    private String numberInShirt;
    private double averageRating;
    private int numberOfGoals;

    public Player(String name, String idNum, int salary, Status status,
     String numberInShirt,int numberOfGoals) {
        super(name, idNum, salary, status);
        this.numberInShirt = numberInShirt;
        this.averageRating = averageRating;
        this.numberOfGoals = numberOfGoals;
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
