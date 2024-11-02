package com.skilldistillery.sanctuary.entities;

public class Animal {
	private String name;
	

	public void makeNoise() {
		System.out.println("ANIMAL NOISES!");
	}

	public void eat(int amount) {
		System.out.println("I'm eating " + amount + " foods.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
