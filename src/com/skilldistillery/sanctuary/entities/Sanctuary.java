package com.skilldistillery.sanctuary.entities;

public class Sanctuary {
	private Animal[] animals = new Animal[5];

	private Attendent attendent = new Attendent();

	public void setAttendant(Attendent attendent) {

		this.attendent = attendent;
	}

	public void addAnimal(Animal animal) {
		if (isFull()) {
			System.out.println("Sorry, all enclosures are full!");
			return;
		}

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = animal;
				System.out.println("Animal added to the sanctuary!");
				break;
			}

		}
	}

	public void listAnimals() {

		for (Animal animal : animals) {
			if (animal != null)
				System.out.println("Enclosure has: " + animal.getName() + " the " + animal.speciesOfAnimal());
		}

	}

	public boolean isFull() {

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				return false;
			}
		}
		return true;
	}

	public void startAttendentRounds() {
		attendent.makeRounds(animals);
	}

}
