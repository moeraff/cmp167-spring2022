import java.util.Scanner;

/*
 *  write a program that prompts the user for their age and determine whether the user can drink alcohol or not
 *	
 *	-Welcome the user
 *	-Prompt them for their age
 *	-wait for their input and store the input into a variable
 *	-Check if the age is 21 or greater
 *	-Output the right message according to the users input
 */
public class Program4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your age in numbers: ");
		int userAge = scan.nextInt();
		
		if (userAge < 21) {
			System.out.println("You are not old enough to drink alcohol according to the U.S. law.");
		}else if (userAge >= 21) {
			System.out.println("You are allowed to drink alcohol according to the U.S. law.");
		}
		scan.close();
	
	}
}