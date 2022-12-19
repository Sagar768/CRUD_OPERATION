package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entity.Company;
import com.company.repository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository repository;

	public Company saveCompany(Company Company) {
		return repository.save(Company);
	}
	
	
	

	public List<Company> saveCompanys(List<Company> Companys) {
		return repository.saveAll(Companys);
	}

	public List<Company> getCompanys() {
		return repository.findAlll();
	}

	public Company getCompanyById(int id) {
		return repository.findById(id).orElse(null);
	}

	public Company getCompanyByName(String name) {
		return repository.findByName(name);
	}

	public String deleteCompany(int id) {
		repository.deleteById(id);
		return "Company removed !! " + id;
	}

	public Company updateCompany(Company Company) {
        Company existingCompany = repository.findById(Company.getId()).orElse(null);
        existingCompany.setName(Company.getName());
        
        existingCompany.setAddress(Company.getAddress());
        existingCompany.setLocation(Company.getLocation());
        existingCompany.setNumberOfPlants(Company.getNumberOfPlants());
        existingCompany.setStarted(Company.getStarted());
        existingCompany.setModified(Company.getModified());
        return repository.save(existingCompany);
    }

}
