package com.Bhaskar.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Bhaskar.entity.Customer;
import com.Bhaskar.repo.CustomerRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private CustomerRepo customerrepo;

	public UserDetails loadUserByphno(String username) throws UsernameNotFoundException {
		Customer c = customerrepo.findByName(username);
		return new User(c.getName(), c.getPwd(), Collections.emptyList());

}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
		
	}}

