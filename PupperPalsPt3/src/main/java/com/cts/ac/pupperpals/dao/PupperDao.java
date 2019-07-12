package com.cts.ac.pupperpals.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cts.ac.pupperpals.dto.Breed;
import com.cts.ac.pupperpals.dto.Pupper;

public interface PupperDao {

	public Pupper getPupperById(int id);
	
	public Breed getBreedById(int id);
	
	
}
