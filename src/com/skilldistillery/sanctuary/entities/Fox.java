package com.skilldistillery.sanctuary.entities;

public class Fox extends Animal {
	
		private static String noise;
		private static String species = "fox";

		@Override
		public void makeNoise() {
			Fox.noise = "YIP! YAP! GEKKER, GEKKER!";
			System.out.println(noise);
		}

		@Override
		public void eat(int amount) {
			makeNoise();
			System.out.println("I'm " + getName() + " the " + speciesOfAnimal() + " and I love munching on " + amount + " lbs of meat");
		}

		@Override
		public String speciesOfAnimal() {
			return Fox.species;
		}
		
	}


