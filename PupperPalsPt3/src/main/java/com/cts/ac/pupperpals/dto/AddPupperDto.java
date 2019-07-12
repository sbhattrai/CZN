package com.cts.ac.pupperpals.dto;

import java.time.LocalDate;

public class AddPupperDto {
	private String name;
	private char sex;
	private double weight;
	private double height;
	private String color;
	private LocalDate dob;
	private String breedName;
	
	
	
	public AddPupperDto() {
		super();
	}



	public AddPupperDto(String name, char sex, double weight, double height, String color, LocalDate dob,
			String breedName) {
		super();
		this.name = name;
		this.sex = sex;
		this.weight = weight;
		this.height = height;
		this.color = color;
		this.dob = dob;
		this.breedName = breedName;
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



	public String getBreedName() {
		return breedName;
	}



	public void setBreedName(String breedName) {
		this.breedName = breedName;
	}
	
	
	
	
}
