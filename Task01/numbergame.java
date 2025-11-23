package Task01;

	import java.util.Scanner;
	import java.util.Random;

	public class numbergame {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();
	        
	        int roundsPlayed = 0;
	        int roundsWon = 0;
	        
	        System.out.println("🎯 Welcome to the Number Guessing Game!");
	        
	        while (true) {
	            int number = rand.nextInt(100) + 1; // Random number between 1–100
	            int attemptsAllowed = 7;
	            int attemptsTaken = 0;
	            boolean guessedCorrectly = false;
	            roundsPlayed++;
	            
	            System.out.println("\n I have chosen a number between 1 and 100.");
	            System.out.println("You have " + attemptsAllowed + " attempts to guess it.");
	            
	            while (attemptsTaken < attemptsAllowed) {
	                System.out.print("Enter your guess: ");
	                int guess = sc.nextInt();
	                attemptsTaken++;
	                
	                if (guess == number) {
	                    System.out.println("Correct! You guessed it in " + attemptsTaken + " attempts.");
	                    guessedCorrectly = true;
	                    roundsWon++;
	                    break;
	                } else if (guess < number) {
	                    System.out.println("Too low! Try again.");
	                } else {
	                    System.out.println("Too high! Try again.");
	                }
	            }
	            
	            if (!guessedCorrectly) {
	                System.out.println("Out of attempts! The number was " + number);
	            }
	            
	            // Ask if user wants another round
	            System.out.print("\nDo you want to play another round? (yes/no): ");
	            String choice = sc.next().toLowerCase();
	            if (!choice.equals("yes")) {
	                break;
	            }
	        }
	        
	        // Final score
	        System.out.println("\n Game Over!");
	        System.out.println("Rounds played: " + roundsPlayed);
	        System.out.println("Rounds won: " + roundsWon);
	        System.out.println("Your score: " + roundsWon + "/" + roundsPlayed + " rounds won.");
	        
	        sc.close();
	    }
	}
