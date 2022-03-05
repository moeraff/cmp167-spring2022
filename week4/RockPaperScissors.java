import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int  pcChoice = rand.nextInt(3)+1;
		
		System.out.println("Welcome to Rock Paper and Scissors 300000");
		System.out.println("Enter 1 for Scissors, 2 for Rock, and 3 for Paper");
		
		int  userChoice = scan.nextInt();
		
		if ((userChoice == 1 && pcChoice == 3) || (userChoice == 2 && pcChoice == 1) || (userChoice == 3 && pcChoice == 2))	{
			System.out.println("You Win !!");
			System.out.println("You chose " + userChoice);
			System.out.println("The Computer chose " + pcChoice);
			
		}
		else if (userChoice == pcChoice) {
		System.out.println("Tied !!");
		System.out.println("You chose: " + userChoice);
		System.out.println("The Computer chose: " + pcChoice);
	
	
		}
		else {
		
			System.out.println("You lose !!");
			System.out.println("You chose: " + userChoice);
			System.out.println("The Computer chose: " + pcChoice);
			
		scan.close();
			}
		}
	}
