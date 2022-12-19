package com.company.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Data
@Entity
public class Company {

	@Id
	@Column(name = "COMPANY_ID")
	private int id;
	private String name;
	private String address;
	private String location;

	private int numberOfPlants;
	@Column(name = "STARTED", columnDefinition = "DATE")
	private LocalDate started;
	@Column(name = "MODIFIED", columnDefinition = "DATE")
	private LocalDate modified;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_ID")
	private List<Plants> plants;
}