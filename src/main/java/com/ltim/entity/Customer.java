package com.ltim.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {

	
	@SequenceGenerator(name="Cust_Gen", sequenceName="CUSTOMER_SEQUENCE", allocationSize = 1)
	@Id 
	@GeneratedValue(generator="Cust_Gen")
	//@GeneratedValue
	private Long id;
	private String name;
	private String address;
		
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
