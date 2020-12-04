package ui;
import java.util.Scanner;

import model.Club;
import model.Skill;

public class Main {
    private Scanner sc;
    private Club myClub;
	
	Main(){
        sc = new Scanner(System.in);
		myClub = new Club("Spartans", "160548", "12/05/2020");
    }
    
	public static void main(String[] args) {
		
		System.out.println("Welcome to the application");
		Main ppal= new Main();
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Main menu, please pick an option\n" +
				"(1) Create a player \n" +
				"(2) Create a Coach \n"+
				"(3) Fire Employee \n"+
				"(4) Show club info \n" +
				"(5) Fill dressing rooms \n" +
				"(6) Fill offices \n" + 
				"(0) To leave the application"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			addPlayer();
			break;
		case 2:
			int typeOfCoach;
			System.out.println("(1) Main Coach \n(2) Coach Assistant");
			typeOfCoach = sc.nextInt();
			switch(typeOfCoach){
				case 1:
				addMainCoach();
					break;
				case 2:
				addAssistantCoach();
					break;
			}
			break;
	
		case 3:
			fireEmployee();
			break;

		case 4:
			showClubInfo();
			break;
		
		case 5:
			fillDressingRoom();
			break;
		case 6:
			fillOffices();
			break;
		
		default:
			System.out.println("Error, wrong option");
		
		}
	}

	private void addPlayer(){
		String name, idNum, numberInShirt, position;
		int salary, numberOfGoals, index, playerPosition;
		position = "";
		System.out.println("Is from team (1) A or team (2) B?");
		index = sc.nextInt();
		sc.nextLine(); // Woofer
		System.out.println("Enter the name of the player:");
		name = sc.nextLine();
		System.out.println("Enter the ID number of the player:");
		idNum = sc.nextLine();
		System.out.println("Enter the salary of the player:");
		salary = sc.nextInt();
		System.out.println("Enter the position:");
		System.out.println("(1) GOALKEEPER\n(2) DEFENDER\n(3) MIDFIELD\n(4) STRIKER");
		playerPosition = sc.nextInt();
		switch (playerPosition) {
			case 1:
				position = "GOALKEEPER";
				break;
			case 2:
				position = "DEFENDER";
				break;
			case 3:
				position = "MIDFIELD";
				break;
			case 4:
				position = "STRIKER";
				break;
		}
		sc.nextLine(); //Woofer 
		System.out.println("Enter the number in the jersey:");
		numberInShirt = sc.nextLine();
		System.out.println("Enter the amount of goals:");
		numberOfGoals = sc.nextInt();
		System.out.println("Enter the average rating of the player");
		double averageRating = sc.nextDouble();
		System.out.println(myClub.addPlayer(index, name, idNum, salary, numberInShirt, numberOfGoals, position, averageRating));
	}	
	private void addMainCoach(){
		String name, idNum, coachSkill;
		coachSkill = "";
		int experienceYears , index , salary, amountOfManagedTeams, wonChampionships, skill;
		System.out.println("Is from team (1) A or team (2) B?");
		index = sc.nextInt();
		sc.nextLine(); // Woofer
		System.out.println("Enter the name of the Main Coach:");
		name = sc.nextLine();
		System.out.println("Enter the ID number of the Main Coach:");
		idNum = sc.nextLine();
		System.out.println("Enter the salary of the Main Coach:");
		salary = sc.nextInt();
		sc.nextLine(); //Woofer 
		System.out.println("Enter the amount of experience years");
		experienceYears = sc.nextInt();
		System.out.println("Enter the amount of managed teams");
		amountOfManagedTeams = sc.nextInt();
		System.out.println("Enter the amount of won championships");
		wonChampionships = sc.nextInt();
		System.out.println("Enter the coach Skill");
		System.out.println("(1) OFFENSIVE\n(2) DEFENSIVE\n(3) CONTROLLER\n(4) LABPLAYS");
		skill = sc.nextInt();
		switch (skill) {
			case 1:
				coachSkill = "OFFENSIVE";
				break;
			case 2:
				coachSkill = "DEFENSIVE";
				break;
			case 3:
				coachSkill = "CONTROLLER";
				break;
			case 4:
				coachSkill = "LABPLAYS";
				break;
		}
		System.out.println(myClub.addCoach(index, experienceYears, name, idNum, salary, amountOfManagedTeams, wonChampionships, coachSkill));
	}
	private void addAssistantCoach(){
		String name, idNum;
		int experienceYears, salary, confirmWasPlayer, index;
		boolean wasPlayer = false;
		System.out.println("Is from team (1) A or team (2) B?");
		index = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of the coach assistant");
		name = sc.nextLine();
		System.out.println("Enter the ID number of the coach assistant");
		idNum = sc.nextLine();
		System.out.println("Enter the salary of the coach assistant");
		salary = sc.nextInt();
		System.out.println("Enter the amount of experience years");
		experienceYears = sc.nextInt();
		System.out.println("This assistant coach assistant?\n(1) Yes\n(2) No");
		confirmWasPlayer = sc.nextInt();
		switch (confirmWasPlayer) {
			case 1:
				wasPlayer = true;
				break;
			case 2:
				wasPlayer = false;
				break;
		}
		System.out.println(myClub.addCoach(index, wasPlayer, experienceYears, name, idNum, salary));
	}
	private void fireEmployee(){
		int team, index;
		System.out.println("Is from Team (1) A or Team (2) B?");
		team = sc.nextInt();
		System.out.println("Select the employee");
		System.out.println(myClub.showAllEmployeesWithIndex());
		index = sc.nextInt();
		System.out.println(myClub.fireEmployee(index, team));
	}
	private void showClubInfo(){
		int index = 0;
		System.out.println("(1) Team A\n(2) Team B\n(3) Both Teams");
		index = sc.nextInt();
		System.out.println(myClub.showClubInfo(index));
	}
	private void fillDressingRoom(){
		System.out.println(myClub.fillDressingRoom());
	}
	private void fillOffices(){
		System.out.println(myClub.fillOffices());
	}
}