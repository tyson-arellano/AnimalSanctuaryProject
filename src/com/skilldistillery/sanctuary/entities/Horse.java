package com.skilldistillery.sanctuary.entities;

public class Horse extends Animal {
	
		private static String noise;
		
		@Override
		public void makeNoise() {
			Horse.noise = "NAY!";
			System.out.println(noise);
		}

		@Override
		public void eat(int amount) {
			System.out.println("I'm munching on " + amount + " lbs of hay");
		}

	}


