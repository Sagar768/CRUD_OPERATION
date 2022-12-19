package com.company.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.company.entity.Company;



@Repository
@EnableJpaRepositories
public interface CompanyRepository extends JpaRepository<Company, Integer> {
	
	 Company findByName(String name);
	 @Query("select e from Company e")
	 List<Company> findAlll();
	 
	
	
	
	
}
