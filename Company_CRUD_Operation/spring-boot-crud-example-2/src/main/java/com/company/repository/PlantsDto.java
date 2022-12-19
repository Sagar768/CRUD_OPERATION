package com.company.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.company.entity.Plants;
@EnableJpaRepositories
public interface PlantsDto extends JpaRepository<Plants, Integer> {

	
	@Query("select e from Plants e")
	 List<Plants> findAlll();

}
