package com.ltim.dto;

import java.util.List;

public class CustomerResponse {

	private List<CustomerDTO> customerList;

	public List<CustomerDTO> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<CustomerDTO> customerList) {
		this.customerList = customerList;
	}

}
