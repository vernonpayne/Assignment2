package com.coderscampus.assignment2;

import java.util.Scanner;
import java.util.Random;

public class assignment2 {
		
	public static void main (String[] args) {
			
		Random random = new Random();
		int trys = 0;
		int targetNumber = random.nextInt(100) +1;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Type a number between: 1 and 100");
			while (trys < 5) {
				String userInput = scanner.nextLine();
				Integer name = Integer.parseInt(userInput);
				if (name == targetNumber) {
					System.out.println("You Win!"); 
					break;
				}
				else if (name >= 101 || name <= 0) {
					System.out.println("Your guess is not between 1 and 100, please try again"); 
					trys = trys + 0;
				}
				else if (name <= targetNumber) { 
					if (trys == 4) {
						trys++;
					}
					if (trys <= 3) {
						System.out.println("Please pick a higher number"); 
						trys++;
					}
				}
				else if (name >= targetNumber) { 
					if (trys == 4) {
						trys++;
					}
					if (trys <= 3) {
						System.out.println("Please pick a lower number"); 
						trys++;
					}
				}
			}
			System.out.println("The number to guess was: " + targetNumber);	
			scanner.close();
	}
}