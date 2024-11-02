package com.skilldistillery.sanctuary.entities;

public class Attendent {

public void makeRounds (Animal[] animal) {
	for (Animal eachEnclosure : animal) {
		if(eachEnclosure != null) {
			eachEnclosure.eat(10);
		}
		else {
			System.out.println("The enclosure is empty.");
		}
	}
}
}
 