package com.skilldistillery.sanctuary.app;

import java.util.Scanner;


import com.skilldistillery.sanctuary.entities.Dog;
import com.skilldistillery.sanctuary.entities.Fox;
import com.skilldistillery.sanctuary.entities.Horse;
import com.skilldistillery.sanctuary.entities.Sanctuary;

public class AnimalSantuaryApp {
	public static void main(String[] args) {
		 AnimalSantuaryApp app = new AnimalSantuaryApp();

		app.launchApp();
	}
	public void launchApp() {
		Scanner sc = new Scanner(System.in);
		
		Sanctuary sanctuary = new Sanctuary();
		
		System.out.println("Welcome to Tyson's Animal Sanctuary. What would you like to do?");
		
		boolean exit = false;
		
		do {
			menu();
			
			String input = sc.next();
			
			switch(input) {
			
			case "1": 
				sanctuary.listAnimals();
				break;
			
			case "2": 
				if (sanctuary.isFull()) {
					System.err.println("Sorry, all enclosures are full!");
					break;
				}
				speciesMenu();
				String species = sc.next();
				
				
				switch (species) {
				
				case "1":
				
					System.out.println("What would you like to name the dog?");
					String givenName = sc.next();
					Dog dog = new Dog();
					dog.setName(givenName);
					sanctuary.addAnimal(dog);
					break;
				case "2":
				
					System.out.println("What would you like to name the horse?");
					String givenName2 = sc.next();
					Horse horse = new Horse();
					horse.setName(givenName2);
					sanctuary.addAnimal(horse);
					break;
				case "3": 
					
					
					System.out.println("What would you like to name the fox?");
					String givenName3 = sc.next();
					Fox fox = new Fox();
					fox.setName(givenName3);
					sanctuary.addAnimal(fox);
					break;
				default: System.err.println("Invalid choice. Please try again. ");
				
				}
				break;
			
			case "3": 
				sanctuary.startAttendentRounds();
				break;
			
			case "4": 
				exit = true;
				break;
			
				default: 
					System.err.println("Invalid choice. Please try again");
			}
			
		}while(exit == false);
		System.out.println("Thank you for dropping by! Goodbye!!");
				
		sc.close();
	}
	public void menu() {
		System.out.println("*****************************************");
		System.out.println("*                Menu                   *");
		System.out.println("*  1.  Display animals in the sanctuary *");
		System.out.println("*  2.  Add animal to the sanctuary      *");
		System.out.println("*  3.  Start attendant rounds           *");
		System.out.println("*  4.  Exit                             *");
		System.out.println("*****************************************");
	}
	public void speciesMenu() {
		System.out.println("********************************************");
		System.out.println("What type of animal would you like to add? *");
		System.out.println("*    1.   Dog                              *");
		System.out.println("*    2.   Horse                            *");
		System.out.println("*    3.   Fox                              *");
		System.out.println("********************************************");
	}
}
