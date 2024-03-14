package com.Bhaskar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.Bhaskar.entity.Customer;
import com.Bhaskar.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer>{

	//Select * from userEntity where uname=:uname;
	public UserEntity findByUname(String Uname);

	public void save(Customer customer);
}
