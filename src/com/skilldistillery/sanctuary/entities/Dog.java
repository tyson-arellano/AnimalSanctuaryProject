package com.skilldistillery.sanctuary.entities;

public class Dog extends Animal{
	private static String noise;
	private static String species = "Dog";
	@Override
	public void makeNoise() {
		Dog.noise = "WOOF WOOF";
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		System.out.println("I'm munching on " + amount + " Dog Treats");
	}

	
	public String speciesOfAnimal() {
		return Dog.species;
	}
	
}
