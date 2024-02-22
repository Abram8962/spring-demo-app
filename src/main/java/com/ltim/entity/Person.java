package com.ltim.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the PERSONS database table.
 * 
 */
@Entity
@Table(name = "PERSONS")
//@NamedQuery(name="Person.findAll", query="SELECT p FROM Person p")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PersonCompositeKey personCompositeKey;

	private String address;

	// private String email;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	// private String pan;

	public Person() {
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public PersonCompositeKey getPersonCompositeKey() {
		return personCompositeKey;
	}

	public void setPersonCompositeKey(PersonCompositeKey personCompositeKey) {
		this.personCompositeKey = personCompositeKey;
	}

}