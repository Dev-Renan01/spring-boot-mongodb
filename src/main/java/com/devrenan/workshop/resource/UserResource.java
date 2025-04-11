package com.devrenan.workshop.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devrenan.workshop.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
			User thiago = new User("1", "Thiago Renan", "thiago@gmail.com");
			User suany = new User("2", "Suany Souza", "suany@gmail.com");
			
			List<User> list = new ArrayList<>();
			list.addAll(Arrays.asList(thiago, suany));
 			return ResponseEntity.ok().body(list);
			
	
	}
}
