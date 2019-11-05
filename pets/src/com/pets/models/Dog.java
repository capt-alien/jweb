package com.pets.models;

public class Dog extends Animal {

	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
		// TODO Auto-generated constructor stub
	}
	public String showAffection() {
		if(this.weight<30) {
			return this.name+" is in your lap and wanting attention.";
		} else {
			return this.name+" is eatting something off the floor. ";
		}
	}

}
