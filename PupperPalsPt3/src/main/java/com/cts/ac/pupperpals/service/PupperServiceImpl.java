package com.cts.ac.pupperpals.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cts.ac.pupperpals.dao.PupperDao;
import com.cts.ac.pupperpals.dto.AddPupperDto;
import com.cts.ac.pupperpals.dto.Breed;
import com.cts.ac.pupperpals.dto.Pupper;

public class PupperServiceImpl implements PupperService {
	
	PupperDao dao;
	
	public PupperServiceImpl(PupperDao dao) {
		this.dao = dao;
	}

	@Override
	public Pupper addPupper(AddPupperDto pupData) {
		return null;
	}
	
	@Override
	public List<Pupper> findPuppersByBreedName(String breedName) {
		return null;
	}
	
	@Override
	public List<Pupper> findAllPuppers() {

		return null;
	}
	
	@Override
	public boolean adoptPupper(Pupper pupper) {
		return false;
	}
	
	@Override
	public List<Breed> getBreeds() {
		return null;
	}

	@Override
	public Pupper getPupperById(int id) {
		
		return dao.getPupperById(id);
	}

	@Override
	public Breed getBreedById(int id) {
		
		return dao.getBreedById(id);
	}
	
	
}
