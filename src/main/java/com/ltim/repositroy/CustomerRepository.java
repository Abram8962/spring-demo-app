package com.ltim.repositroy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ltim.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Query(value = "select * from Customer", nativeQuery = true)
	public List<Customer> findAllCustomer();
	
}
