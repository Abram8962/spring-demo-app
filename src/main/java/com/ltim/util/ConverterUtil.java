package com.ltim.util;

import java.text.ParseException;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.ltim.dto.CustomerDTO;
import com.ltim.dto.PersonDTO;
import com.ltim.entity.Customer;
import com.ltim.entity.Person;

@Component
public class ConverterUtil {

	private ModelMapper modelMapper = new ModelMapper();

	/*
	 * @Autowired public ConverterUtil(ModelMapper modelMapper) { this.modelMapper =
	 * modelMapper; }
	 */

	public CustomerDTO convertToDto(Customer customer) {
		CustomerDTO customerDTO = modelMapper.map(customer, CustomerDTO.class);
		return customerDTO;
	}

	public Customer convertToEntity(CustomerDTO customerDTO) throws ParseException {
		Customer customer = modelMapper.map(customerDTO, Customer.class);
		return customer;
	}
	
	public PersonDTO convertToDto(Person person) {
		PersonDTO personDto = modelMapper.map(person, PersonDTO.class);
		return personDto;
	}

	public Person convertToEntity(PersonDTO personDTO) throws ParseException {
		Person person = modelMapper.map(personDTO, Person.class);
		return person;
	}
}
