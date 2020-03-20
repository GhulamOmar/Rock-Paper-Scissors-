package dmacc.beans;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
private String player1;
private String computerPlayer;
private String winner;

	public Game(String player1) {
		this.player1 = player1;
		this.setComputerPlayer();
		this.determineWinner();
	}

	private void determineWinner() {
		// TODO Auto-generated method stub
		if (player1.equals("rock"))
        {
            if (computerPlayer.equals("rock"))
            {
            	this.setWinner("It is a tie.");
                
            }
            if (computerPlayer.equals("scissors"))
            {
            	this.setWinner("Player1.");
            }
            if (computerPlayer.equals("paper"))
            {
            	this.setWinner("computer player.");
            }
        }
        else if (player1.equals("scissors"))
        {
            if (computerPlayer.equals("rock"))
            {
            	this.setWinner("computer player.");
            }
            if (computerPlayer.equals("scissors"))
            {
            	this.setWinner("It is a tie.");
            }
            if (computerPlayer.equals("paper"))
            {
            	this.setWinner("Player1.");
            }
        }
        else if (player1.equals("paper"))
        {
            if (computerPlayer.equals("rock"))
            {
            	this.setWinner("Player1.");
            }
            if (computerPlayer.equals("scissors"))
            {
            	this.setWinner("computer player.");
            }
            if (computerPlayer.equals("paper"))
            {
            	this.setWinner("It is a tie.");
            }
        }
    }
	private void setComputerPlayer() {
		// TODO Auto-generated method stub		
		  Random random = new Random();
	        int input = random.nextInt(2)+1;
	        if (input == 1)
	            computerPlayer = "paper";
	        else if(input == 2)
	            computerPlayer ="rock";
	        else 
	            computerPlayer ="scissors";
	   			return;
	}
}
