package com.example.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="company")
	private String company;
	@Column(name="phone")
	private Integer phone;
	
	public Employee(Long id, String name, String company, Integer phone) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.phone = phone;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	
	
}
