package com.Bhaskar.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Bhaskar.entity.UserEntity;
import com.Bhaskar.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity Entity = userRepo.findByUname(username);
		return new User(Entity.getUname(),Entity.getUpwd(),Collections.emptyList());
	}

	
	public boolean save(UserEntity user) {
		
		user=userRepo.save(user);
		return user.getId()!=null;
	}
	
}
