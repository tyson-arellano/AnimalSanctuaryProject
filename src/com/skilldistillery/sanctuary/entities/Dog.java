package com.skilldistillery.sanctuary.entities;

public class Dog extends Animal{
	private static String noise;
	private static String species = "dog";
	
	@Override
	public void makeNoise() {
		Dog.noise = "WOOF WOOF";
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		makeNoise();
		System.out.println("I'm " + getName() + " the "+ speciesOfAnimal() + " and I love munching on " + amount + " dog treats");
	}

	@Override
	public String speciesOfAnimal() {
		return Dog.species;
	}
	
}
