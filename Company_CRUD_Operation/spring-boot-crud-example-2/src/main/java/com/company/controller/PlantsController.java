package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.entity.Company;
import com.company.entity.Plants;
import com.company.repository.CompanyRepository;
import com.company.repository.PlantsDto;
import com.company.service.CompanyService;
import com.company.service.PlantsService;
@RestController
public class PlantsController {
	
	@Autowired
	private PlantsDto dto;
	@Autowired
	private PlantsService service;
	@Autowired
	private CompanyService companyService;
	@Autowired
	private CompanyRepository companyRepository;
	
	
	
	//Add Plants
		@PostMapping("/addPlants")
		public Plants addCompany(@RequestBody Plants plants) {
			return service.savePlants(plants);
		}
		
		
		
		//Get All Plants
		@GetMapping("/getPlants")
		public List<Plants> findAllPlants() {
			return service.getPlants();
		}
		
		
		
		
		
		
		
		
		
		
		
		//Update Plant
		@PutMapping("/updatePlant")
		public Plants updatePlant(@RequestBody Plants plant) {
			return service.updatePlant(plant);
		}
		
		//Remove Plant By Id
		@DeleteMapping("/deletePlant{id}")
		public String deletePlant(@PathVariable int id) {
			return service.deletePlant(id);
		}	

	
}
