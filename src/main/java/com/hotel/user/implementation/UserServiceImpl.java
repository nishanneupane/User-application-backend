package com.hotel.user.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.user.entity.User;
import com.hotel.user.exception.ResourceNotFoundException;
import com.hotel.user.repository.UserRepository;
import com.hotel.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUserByUserId(String userId) {
		return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id is not found "+userId));
	}

	@Override
	public User updateUser(User user, String userId) {
		 User user1 = userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("user not found with "+userId));
		 
		 user1.setName(user.getName());
		 user1.setAbout(user.getAbout());
		 user1.setEmail(user.getEmail());
		
		 return userRepository.save(user1);
	}

	@Override
	public void deleteUser(String userId) {
		userRepository.deleteById(userId);
		
	}

}
