package com.skilldistillery.sanctuary.entities;

public class Fox extends Animal {
	
		private static String noise;

		@Override
		public void makeNoise() {
			Fox.noise = "Nee NEE nee NEE";
			System.out.println(noise);
		}

		@Override
		public void eat(int amount) {
			System.out.println("I'm munching on " + amount + " lbs of meat");
		}

	}


