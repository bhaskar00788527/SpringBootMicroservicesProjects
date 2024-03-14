package com.Bhaskar.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bhaskar.entity.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {

	public  Customer findByName(String name);
	
	public Customer findByPhno(Long phno);

}

