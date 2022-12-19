package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entity.Company;
import com.company.entity.Plants;
import com.company.repository.CompanyRepository;
import com.company.repository.PlantsDto;

@Service
public class PlantsService {
	@Autowired
	private PlantsDto plantRepository;
	
	@Autowired
	private CompanyRepository companyRepository;

	public Plants savePlants(Plants plants) {
		return plantRepository.save(plants);
	}

	
	
	
	
	public List<Plants> getPlants() {
		return plantRepository.findAlll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


	public String deletePlant(int id) {
		plantRepository.deleteById(id);
		return "Company removed !! " + id;
	}

	public Plants updatePlant(Plants plant) {
        Plants existingCompany = plantRepository.findById(plant.getId()).orElse(null);
        existingCompany.setName(plant.getName());
        
        existingCompany.setCapacity(plant.getCapacity());
        existingCompany.setEmp(plant.getEmp());
        existingCompany.setList_of_products(plant.getList_of_products());
        existingCompany.setNumberOfLines(plant.getNumberOfLines());
        existingCompany.setName(plant.getName());
        return plantRepository.save(existingCompany);
    }
	
	
	
	
	
}
