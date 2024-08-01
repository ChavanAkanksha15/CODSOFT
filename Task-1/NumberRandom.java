package Task1;

import java.util.Scanner;

public class NumberRandom {
 
	public static void main(String[] args) {
		//Generate a random number within a specified range, such as 1 to 100.
		int answer= (int) (Math.random()* 100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		boolean guess=false;
		int Attempts = 0;
		//Prompt the user to enter their guess for the generated number.

		System.out.println("Guess number between 1 to 100: ");
		
		
		while(!guess && Attempts<10)// Limit the number of attempts the user has to guess the number.
		{
			int userGuess = scanner.nextInt();
			
			if(userGuess==answer) {
				guess=true;
			}else
			{
				Attempts++;
				//. Compare the user's guess with the generated number and provide feedback on whether the guess
				//is correct, too high, or too low
                if (userGuess > answer) 
                {
                    System.out.println("You guess  high number.");
                } else 
                {
                    System.out.println("You guess  low number.");
                }
			}
		}
		scanner.close();
		
		if (guess) 
        {
            System.out.println("Congratulations! You guessed correctly! The number was " + answer);
        } else 
        {
            System.out.println("Sorry, you ran out of guesses. The correct answer was " + answer);
        }
	}
}
