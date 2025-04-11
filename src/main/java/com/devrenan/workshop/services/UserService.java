package com.devrenan.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devrenan.workshop.domain.User;
import com.devrenan.workshop.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User>findAll(){
		return repo.findAll();
	}
}
