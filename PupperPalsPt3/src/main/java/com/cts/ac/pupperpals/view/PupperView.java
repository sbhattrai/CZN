package com.cts.ac.pupperpals.view;

import java.time.LocalDate;
import java.util.List;

import com.cts.ac.pupperpals.controller.PupperController;
import com.cts.ac.pupperpals.dto.AddPupperDto;
import com.cts.ac.pupperpals.dto.Pupper;
import com.cts.ac.pupperpals.service.InvalidBreedNameException;

public class PupperView implements Runner{
	PupperController controller;
	
	@Override
	public void run(PupperController c) {
		controller = c;
		System.out.println(c.getBreed(1));
		System.out.println(c.getBreed(2));
		System.out.println(c.getBreed(3));
		
		System.out.println(c.getPupper(1));
		System.out.println(c.getPupper(2));
		System.out.println(c.getPupper(3));
		System.out.println(c.getPupper(4));
		System.out.println(c.getPupper(5));

		
		
		
	}

}
