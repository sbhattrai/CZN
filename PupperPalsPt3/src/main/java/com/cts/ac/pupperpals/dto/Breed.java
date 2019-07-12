package com.cts.ac.pupperpals.dto;

public class Breed {

	private String name;
	private String temperament;
	private String coat;
	private int id;
	
	public Breed() {
		super();
	}

	public Breed(String name, String temperment, String coat) {
		super();
		this.name = name;
		this.temperament = temperment;
		this.coat = coat;
	}

	public String getName() {
		return name;
	}

	public String getTemperament() {
		return temperament;
	}

	public void setTemperament(String temperament) {
		this.temperament = temperament;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTemperment() {
		return temperament;
	}

	public void setTemperment(String temperment) {
		this.temperament = temperment;
	}

	public String getCoat() {
		return coat;
	}

	public void setCoat(String coat) {
		this.coat = coat;
	}
	
	
	
	
}
