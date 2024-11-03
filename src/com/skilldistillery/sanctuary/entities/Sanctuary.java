package com.skilldistillery.sanctuary.entities;

public class Sanctuary {
	private Animal[] animals = new Animal[5];

	private Attendent attendent = new Attendent();

	public void setAttendant(Attendent attendent) {

		this.attendent = attendent;
	}

	public void addAnimal(Animal animal) {
		if (isFull()) {
			System.err.println("Sorry, all enclosures are full!");
			return;
		}

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				animals[i] = animal;
				System.out.println();
				System.out.println("Animal added to the sanctuary!");
				System.out.println();
				break;
			}

		}
	}

	public void listAnimals() {

//		for (Animal animal : animals) {
//			if (animal != null)
//				System.out.println("Enclosure has: " + animal.getName() + " the " + animal.speciesOfAnimal());
//		}
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println("Enclosure " + (i+1) + " has: " + animals[i].getName() + " the " + animals[i].speciesOfAnimal());
			}
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
