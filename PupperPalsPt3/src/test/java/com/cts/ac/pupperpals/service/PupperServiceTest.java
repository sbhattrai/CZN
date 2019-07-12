package com.cts.ac.pupperpals.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import com.cts.ac.pupperpals.dao.PupperDaoInMemory;
//import com.cts.ac.pupperpals.dao.PupperData;
import com.cts.ac.pupperpals.dto.AddPupperDto;
import com.cts.ac.pupperpals.dto.Breed;
import com.cts.ac.pupperpals.dto.Pupper;

class PupperServiceTest {
//	PupperService service;
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//		
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}
//
//	@BeforeEach
//	void setUp() throws Exception {
//		service = new PupperServiceImpl(new PupperDaoInMemory(getTestData()));
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//	}
//
//	@Test
//	void testAddPupper() {
//		AddPupperDto pupper = new AddPupperDto("Buffy", 'F', 10, 12, "White", LocalDate.parse("2013-10-03"), "Bichon Frise");
//		assertEquals(service.findPuppersByBreedName("Bichon Frise").size(), 0);
//		service.addPupper(pupper);
//		assertEquals(service.findPuppersByBreedName("Bichon Frise").size(), 1);
//	}
//	
//	@Test
//	void testFindPuppersByBreedName() {
//		List<Pupper> puppers = service.findPuppersByBreedName("Boxer");
//		assertEquals(puppers.size(), 2);
//		
//	}
//	
//	@Test
//	void testFindAllPuppers() {
//		List<Pupper> puppers = service.findAllPuppers();
//		assertEquals(puppers.size(), 2);
//	}
//	
//	@Test
//	void testAdoptPupper() {
//		List<Pupper> puppers = service.findAllPuppers();
//		assertEquals(puppers.size(), 2);
//		service.adoptPupper(puppers.get(1));
//		puppers = service.findAllPuppers();
//		assertEquals(puppers.size(), 1);
//		
//	}
//	
//	@Test
//	void testGetBreeds() {
//		List<Breed> breeds = service.getBreeds();
//		assertEquals(breeds.size(), 3);
//	}
//	
//	//Test Data
//	private static Breed boxer = new Breed("Boxer", "Alert, patient, playful, wary of strangers", "Short, shiny, smooth, and tight");
//	private static Breed bichonFrise = new Breed("Bichon Frise", "Cheerful, gentle, affectionate", "Soft undercoat; coarse, curley outercoat");
//	private static Breed husky = new Breed("Siberian Husky", "Friendly, gentle, alert, outgoing", "Double, medium length");
//	
//	private Map<Breed, List<Pupper>> getTestData() {
//		Map <Breed, List<Pupper>> testData = new HashMap<>();
//		testData.put(boxer,  new ArrayList<Pupper>());
//		testData.put(bichonFrise, new ArrayList<Pupper>());
//		testData.put(husky,  new ArrayList<Pupper>());
//		testData.get(boxer).add(new Pupper("Lexi", 'F', 58, 22, "Brown with Black", LocalDate.parse("2013-04-18"), boxer));
//		testData.get(boxer).add(new Pupper("Ali", 'M', 62, 23, "Brown with white", LocalDate.parse("2015-08-12"), boxer));
//		
//		return testData;
//	}

}
