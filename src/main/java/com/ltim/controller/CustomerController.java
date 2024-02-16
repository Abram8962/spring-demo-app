package com.ltim.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.dto.CustomerDTO;
import com.ltim.dto.CustomerResponse;
import com.ltim.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	private CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	public CustomerController() {
		super();
	}

	@GetMapping("/hi")
	public String getText() {
		return "hi I am executed successfuly";
	}

	@GetMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerDTO> retrieveCustomerById(@PathVariable long id) {
		return new ResponseEntity<CustomerDTO>(customerService.findById(id), HttpStatus.OK);
	}

	@GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerResponse> retrieveCustomers() {
		CustomerResponse customerList = customerService.retrieveCustomers();
		return new ResponseEntity<CustomerResponse>(customerList, HttpStatus.OK);
	}

	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerDTO> addNewCustomer(@RequestBody CustomerDTO customerDTO) throws ParseException {
		System.out.println("inside post method::");
		return new ResponseEntity<CustomerDTO>(customerService.addCustomer(customerDTO), HttpStatus.OK);
	}

	@PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerDTO> updateCustomer(@PathVariable long id, @RequestBody CustomerDTO customerDTO)
			throws ParseException {
		return new ResponseEntity<CustomerDTO>(customerService.updateCustomer(id, customerDTO), HttpStatus.OK);

	}

	@DeleteMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteCustomer(@PathVariable long id) {
		Boolean responseFlag = customerService.deleteCustomer(id);
		ResponseEntity<Void> response = responseFlag ? new ResponseEntity<Void>(HttpStatus.NO_CONTENT)
				: new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		return response;

	}
	
	@GetMapping(value = "/native" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CustomerResponse> retrieveCustomersUsinNativeQuery() {
		System.out.println("inside native method call");
		CustomerResponse customerList = customerService.findAllCustomers();
		return new ResponseEntity<CustomerResponse>(customerList, HttpStatus.OK);
	}


}