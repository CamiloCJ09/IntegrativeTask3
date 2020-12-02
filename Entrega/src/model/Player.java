package model;

//Todo: Añadir Implements profitable
public class Player extends Employee implements Profitable {
    private String numberInShirt;
    private double averageRating;
    private int numberOfGoals;
    private Position position;

    public Player(String name, String idNum, int salary, String numberInShirt, int numberOfGoals, Position position) {
        super(name, idNum, salary);
        this.numberInShirt = numberInShirt;
        this.averageRating = 0.0;
        this.numberOfGoals = numberOfGoals;
        this.position = position;
    }

    /**
     * Method that show the information of each player
     * 
     * @return
     */
    @Override
    public String employeeToString() {
        String msg = super.employeeToString();
        msg += "Position: " + position + "\n" + "Number in shirt: " + numberInShirt + "\n" + "Average rating: "
                + averageRating + "\n" + "Amount of goals: " + numberOfGoals + "\n";
        return msg;
    }
    public double calculateMarketPrice() {
        double marketPrice = 0.0;
        if(position == Position.GOALKEEPER){
            marketPrice = (getSalary()*12)+(averageRating*150);
        }else if(position == Position.DEFENDER){
            marketPrice = (getSalary()*13)+(averageRating*125)+(numberOfGoals*100);
        }else if(position == Position.MIDFIELD){
            marketPrice = (getSalary()*14)+(averageRating*135)+(numberOfGoals*125);
        }else{
            marketPrice = (getSalary()*15)+(averageRating*145)+(numberOfGoals*150);
        }
        return marketPrice;
    }

    public double calculateStars() {
        double stars = 0.0;
        if(position == Position.GOALKEEPER){
            stars = (averageRating*0.9);
        }else if(position == Position.DEFENDER){
            stars = (averageRating*0.9)+(numberOfGoals/100);
        }else if(position == Position.MIDFIELD){
            stars = (averageRating*0.9)+(numberOfGoals/90);
        }else{
            stars = (averageRating*0.9)+(numberOfGoals/80);
        }
        return stars;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    

}
