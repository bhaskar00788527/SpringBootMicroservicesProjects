package com.Bhaskar.service;

import java.util.List;

import com.Bhaskar.entity.User;

public interface UserService {
	
    //public User save(User user);

    public User getUserById(Long userId);

    public List<User> getAllUsers();

    public User updateUser(User user);

    public void deleteUser(Long userId);

	public User save(User user);
}
