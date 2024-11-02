package com.skilldistillery.sanctuary.entities;

public class Sanctuary {
	private Animal [] animals = new Animal [5];
	
	private Attendent attendent = new Attendent();

	public void setAttendant(Attendent attendent) {
		
		this.attendent = attendent;
	}
	
	public void listAnimals() {
	   for (Animal animal : animals) {
		if(animal != null)
			System.out.println(animal.getName()+ " the " + animal.speciesOfAnimal());
	}
	}
	public void addAnimal(Animal animal) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) { 
				animals[i]= animal;
				break;
			}
	}
	}
	public void startAttendentRounds() {
		attendent.makeRounds(animals);
	}

}

