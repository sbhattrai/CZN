package com.cts.ac.pupperpals.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.cts.ac.pupperpals.dto.*;
import com.cts.ac.pupperpals.service.PupperService;
import com.cts.ac.pupperpals.view.Runner;

public class PupperController {
	private Runner frontEnd;
	private PupperService service;
	
	public PupperController(Runner frontEnd, PupperService service) {
		super();
		this.frontEnd = frontEnd;
		this.service = service;
		frontEnd.run(this);
	}
	
	public Pupper getPupper(int id) {
		return service.getPupperById(id);
	}
	
	public Breed getBreed(int id) {
		return service.getBreedById(id);
	}
	
	public Pupper addPupper(AddPupperDto pupData) {
		return service.addPupper(pupData);
	}
	
	public List<Pupper> listPuppers() {
		return service.findAllPuppers();
	}
	
	public List<Pupper> listPuppers(String breed){
		return service.findPuppersByBreedName(breed);
	}
	
	public void adoptPupper(Pupper pupper) {
		service.adoptPupper(pupper);
	}
	

	public List<String> getBreeds() {
		return null;
	}
	
	
}
