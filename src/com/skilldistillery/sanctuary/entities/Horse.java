package com.skilldistillery.sanctuary.entities;

public class Horse extends Animal {
	
		private static String noise;
		private static String species = "Horse";
		
		@Override
		public void makeNoise() {
			Horse.noise = "NAY!";
			System.out.println(noise);
		}

		@Override
		public void eat(int amount) {
			makeNoise();
			System.out.println("I'm " + getName() + " the " + speciesOfAnimal() + " and I love to eat " + amount + " lbs of hay");
		}

		@Override
		public String speciesOfAnimal() {
			return Horse.species;
		}
		
	}


