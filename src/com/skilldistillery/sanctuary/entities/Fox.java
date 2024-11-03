package com.skilldistillery.sanctuary.entities;

public class Fox extends Animal {
	
		private static String noise;
		private static String species = "Fox";

		@Override
		public void makeNoise() {
			Fox.noise = "Yip! Yap! Gekker, Gekker";
			System.out.println(noise);
		}

		@Override
		public void eat(int amount) {
			System.out.println(getName() + " is eating " + amount + " lbs of meat");
		}

		@Override
		public String speciesOfAnimal() {
			return Fox.species;
		}
		
	}


