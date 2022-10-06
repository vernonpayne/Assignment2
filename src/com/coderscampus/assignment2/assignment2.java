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
				if (name >= 101) {
					System.out.println("Your guess is not between 1 and 100, please try again"); 
					trys--;
				}
				if (name <= 0) {
					System.out.println("Your guess is not between 1 and 100, please try again"); 
					trys--;
				}
				else if (name <= targetNumber) {
					System.out.println("Please pick a higher number"); 
					trys++;
				}
				else if(name >= targetNumber) {
					System.out.println("Please pick a lower number"); 
					trys++;
				}
				else if(name == targetNumber) {
					System.out.println("You Win!"); 
					break;
				}
			}
			System.out.println("The number to guess was: " + targetNumber);	
			scanner.close();
}
}