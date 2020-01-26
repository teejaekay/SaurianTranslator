// Taylor Kelly 
// This program translates any given English word to Saurian 
// and Saurian to English.

import java.util.Scanner; 

public class Translator {

	public static void main(String[] args) {
		
		int choice; 
		
		Scanner input = new Scanner(System.in); 
		
		do {
			
			System.out.println("Please choose an option:\n");
			System.out.println("1 - English to Saurian");
			System.out.println("2 - Saurian to English"); 
			System.out.println("3 - Exit");
			
			choice = input.nextInt();
			
			switch (choice) {
			
			case 1: 
				
				System.out.println("\nEnter English Word:");
				String engWord = input.next(); 
				Saurian saur = new Saurian(engWord, true);
				System.out.println("In Saurian: " + saur.getSaurian() + "\n"); 
				break; 
				
			case 2: 
				
				System.out.println("\nEnter Saurian Word:\n");
				String saurWord = input.next();
				Saurian saur2 = new Saurian(saurWord, false); 
				System.out.println("In English: " + saur2.getEnglish() + "\n"); 
				break; 
			
			default: 
				
				if (choice != 3) {
					
					System.out.println("Invalid Choice, Enter Again.\n");
					
				}
				
			}
			
		} while (choice != 3); 
		
	

	}

}
