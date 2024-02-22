package com.ltim.dto;

import com.ltim.entity.PersonCompositeKey;

public class PersonDTO {

	private PersonCompositeKey personCompositeKey;

	private String address;

	// private String email;

	private String firstName;

	private String lastName;

	// private String pan;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
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

	@Override
	public String toString() {
		return "PersonDTO [personCompositeKey=" + personCompositeKey + ", address=" + address + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}

}
