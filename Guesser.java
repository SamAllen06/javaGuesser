// Guesser

import java.util.*;

public class Guesser{
	public static void main(String[] args){
		boolean keepGoing = true;
		while (keepGoing){
			String response = menu();
			if (response.equals("0")){
				System.out.println("Goodbye!");
				keepGoing = false;
			} //end if statement
			else if (response.equals("1")){
				humanGuesser();
			} //end else if statement
			else if (response.equals("2")){
				computerGuesser();
			} //end else if statement
			else{
				System.out.println("Invalid response, please choose a number 0-2");
			} //end else statement
		} //end while loop
	} //end main definition

	public static String menu(){
		System.out.print("What would you like to do? \n 0: Quit \n 1: Play Human Guesser \n 2: Play Computer Guesser \n Your choice: ");
		Scanner input = new Scanner(System.in);
		String response = input.nextLine();
		System.out.println();
		return response;
	} //end menu definition

	public static void humanGuesser(){
		int guessNumber = 0;
		int answer = (int)(Math.random()*100 +1);
		boolean keepGoing = true;
		Scanner input = new Scanner(System.in);
		while (keepGoing){
			guessNumber += 1;
			System.out.print("What's your guess? ");
			String response = input.nextLine();
			int intResponse = Integer.parseInt(response); //validate input later
			if (intResponse > answer){
				System.out.println("Too high!");
			} //end if statement
			else if (intResponse < answer){
				System.out.println("Too low...");
			} //end else if statement
			else if (intResponse == answer){
				System.out.println("Correct!");
				keepGoing = false;
				if (guessNumber < 7){
					System.out.println("You did amazing!");
				} //end if statement
				else if (guessNumber == 7){
					System.out.println("You did fine...");
				} //end else if statement
				else if (guessNumber > 7){
					System.out.println("Ah, you can get it in less guesses than that!");
				} //end else if statement
			} //end else if statement
			System.out.println();
		} //end while loop
	} //end humanGuesser definition

	public static void computerGuesser(){
		int lowEnd = 0;
		int highEnd = 101;
		System.out.println("Think of a number... Don't forget it!");
		boolean keepGoing = true;
		Scanner input = new Scanner(System.in);
		while (keepGoing){
			int guess = (int)((lowEnd + highEnd)/2);
			System.out.print("Is it " + guess + "? Too (H)igh, too (L)ow, or (C)orrect? ");
			String response = input.nextLine();
			if (response.equalsIgnoreCase("h")){
				highEnd = guess;
			} //end if statement
			else if (response.equalsIgnoreCase("l")){
				lowEnd = guess;
			} //end else if statement
			else if (response.equalsIgnoreCase("c")){
				System.out.println("I win!!!!!! In your face!");
				keepGoing = false;
			} //end else if statement
			else{
				System.out.println("Sorry, invalid response. Let's try that again");
			} //end else statement
			if (lowEnd == highEnd){
				System.out.print("I hope you didn't forget your number! Because that means you cheated... Try again when you're ready to play fair. ");
				keepGoing = false;
			} //end if statement
			System.out.println();
		} //end while loop
	} //end computerGuesser definition
} //end class definition

