package com.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Data
@Entity
public class Plants {
	@Id
	private int id;
	private String name;
	private int numberOfLines;
	@Column(name = "EMPLOYEES")
	private int emp;
	private int capacity;
	@Column(name = "LIST_OF_PRODUCTS")
	private String list_of_products;

}
