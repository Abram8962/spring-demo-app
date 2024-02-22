package com.ltim.repositroy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ltim.entity.Person;
import com.ltim.entity.PersonCompositeKey;

public interface PersonRepository extends JpaRepository<Person, PersonCompositeKey> {
	
	@Query(value = "select * from PERSONS", nativeQuery = true)
	public List<Person> findAllPersons();

}
