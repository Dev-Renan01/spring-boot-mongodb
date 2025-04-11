package com.devrenan.workshop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.devrenan.workshop.domain.User;
import com.devrenan.workshop.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	public UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();	
		
		User thiago = new User(null, "Thiago Renan", "thiago@gmail.com");
		User suany = new User(null, "Suany Souza", "suany@gmail.com");
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
	
		userRepository.save(thiago);
		userRepository.save(suany);
		userRepository.save(maria);
		
	}
	
}
