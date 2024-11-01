package com.skilldistillery.sanctuary.entities;



public class Sauctuary {
	private Animal [] animals = new Animal [5];
	private int numAnimals = 0;
	private Attendent attendent = new Attendent();

	public void setAttendant(Attendent attendent) {
		
		this.attendent = attendent;
	}
	
	public void listAnimals() {
	   
	}
	public void addAnimal(Animal animal) {
		animals[numAnimals] = animal;
		numAnimals++;
	}
	
	public void startAttendentRounds() {
		
	}

}
