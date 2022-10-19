import java.util.*;

public class RockPaperScissors {
	
	public static final String rock = "rock";
	public static final String paper = "paper";
	public static final String scissors = "scissors";
	
	public static void main (String[] args) {
		System.out.println("rock paper scissors ... SHOOT");
	    System.out.println();
	          
	    String playerMove = getPlayerMove();
	    String computerMove = getComputerMove(); 
	      
	    if (playerMove.equals(computerMove)) {
	            System.out.println("It's a tie!!"); 
	    }
	    else if (playerMove.equals(RockPaperScissors.rock)) {
	        System.out.println(computerMove.equals(RockPaperScissors.paper) ? "Computer Wins!!": "Player wins!!");   
	    }
	    else if (playerMove.equals(RockPaperScissors.paper)) {
	        System.out.println(computerMove.equals(RockPaperScissors.scissors) ? "Computer Wins!!": "Player wins!!");   
	    }
	    else {
	        System.out.println(computerMove.equals(RockPaperScissors.rock) ? "Computer Wins!!": "Player wins!!");
	    }
	}
	
	public static String getComputerMove(){
		String computermove;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        
        if (input == 1) {
            computermove = RockPaperScissors.rock;
        }
        
        else if(input == 2) {
            computermove = RockPaperScissors.paper;
        }
        
        else {
            computermove = RockPaperScissors.scissors;
        }
        
        System.out.println("Computer chooses " + computermove);
        System.out.println();
        return computermove;    
	}
	
	public static String getPlayerMove() {
		Scanner scnr = new Scanner(System.in);
		String playermove = scnr.next();
		System.out.println("Player chooses " + playermove);
		return playermove;
	}
}
