package com.pets.models;

public class Cat extends Animal implements Pet {

	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
	}
	// TODO Auto-generated constructor stub
	public String showAffection() {
		return this.name+" Looked at you.";
	}
}
