package com.skilldistillery.sanctuary.app;

import com.skilldistillery.sanctuary.entities.Attendent;
import com.skilldistillery.sanctuary.entities.Dog;
import com.skilldistillery.sanctuary.entities.Sanctuary;

public class AnimalSantuaryApp {
	public static void main(String[] args) {
		Sanctuary san = new Sanctuary(); 
		Attendent al = new Attendent();
		Dog dog1 = new Dog();
		dog1.setName("Gary"); 
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		Dog dog4 = new Dog();
		Dog dog5 = new Dog();
		Dog dog6 = new Dog();
		
		
		san.addAnimal(dog1);
		san.addAnimal(dog2);
		san.addAnimal(dog3);
		
		san.addAnimal(dog4);
		san.addAnimal(dog5);
		san.addAnimal(dog6);
		san.listAnimals();
		
		san.startAttendentRounds();;
	}
	
}
