package com.cts.ac.pupperpals.service;

import java.util.List;

import com.cts.ac.pupperpals.dto.AddPupperDto;
import com.cts.ac.pupperpals.dto.Breed;
import com.cts.ac.pupperpals.dto.Pupper;

public interface PupperService {
	
	public Pupper getPupperById(int id);
	
	public Breed getBreedById(int id);

	public Pupper addPupper(AddPupperDto pupData);

	public List<Pupper> findPuppersByBreedName(String breedName);

	public List<Pupper> findAllPuppers();

	boolean adoptPupper(Pupper pupper);

	List<Breed> getBreeds();

}