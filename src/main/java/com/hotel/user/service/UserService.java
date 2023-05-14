package com.hotel.user.service;

import java.util.List;

import com.hotel.user.entity.User;

public interface UserService {
	
	User saveUser(User user);
	List<User> getAllUser();
	User getUserByUserId(String userId);
	
	User updateUser(User user,String userId);
	void deleteUser(String userId);
}
