package com.test.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.test.model.User;


public interface UserService {
	
	public User addUser(String name,String email,String gender,String password,
			            long mobile, String address, String city,String State,long pincode,String country)throws Exception;
	
	public Optional<User> getUserById(Long id);
	public List<User> getAllUser();
	public void deleteUserById(Long id);
	public User updateUser(User user);
	public Optional<User> getUserByEmail(String email);
	
	

	

}
