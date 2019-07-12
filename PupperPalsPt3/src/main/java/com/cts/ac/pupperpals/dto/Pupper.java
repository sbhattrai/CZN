
package com.cts.ac.pupperpals.dto;

import java.time.LocalDate;

public class Pupper {
	private String name;
	private char sex;
	private double weight;
	private double height;
	private String color;
	private LocalDate dob;
	private Breed breed;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pupper() {
		super();
	}
	
	//todo: generate exception for sex param outside of 'M', 'm', 'F', 'f'
	//View should prevent this as well, but may make a good exception handling example
	public Pupper(String name, char sex, double weight, double height, String color, LocalDate dob, Breed breed) {
		super();
		this.name = name;
		this.sex = sex;
		this.weight = weight;
		this.height = height;
		this.color = color;
		this.dob = dob;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	//todo: generate exception for sex param outside of 'M', 'm', 'F', 'f'
	//View should prevent this as well, but may make a good exception handling example
	public void setSex(char sex) {
		this.sex = sex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	
	@Override
	public String toString() {
		return name + ": " + breed.getName();
	}
	
	
}
