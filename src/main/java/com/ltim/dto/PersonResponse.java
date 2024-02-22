package com.ltim.dto;

import java.util.List;

public class PersonResponse {

	private List<PersonDTO> personList;

	public List<PersonDTO> getPersonList() {
		return personList;
	}

	public void setPersonList(List<PersonDTO> personList) {
		this.personList = personList;
	}

	@Override
	public String toString() {
		return "PersonResponse [personList=" + personList + "]";
	}

}
