package com.ltim.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PersonCompositeKey implements Serializable {

	private static final long serialVersionUID = 1L;
	private String email;
	private String pan;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

}
