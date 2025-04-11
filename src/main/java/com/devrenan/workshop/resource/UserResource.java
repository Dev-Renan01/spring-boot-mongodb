package com.devrenan.workshop.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devrenan.workshop.domain.User;
import com.devrenan.workshop.dto.UserDTO;
import com.devrenan.workshop.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {	

	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> findAll(){
			List<User> list = service.findAll();
			List<UserDTO> listDTO = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
			return ResponseEntity.ok().body(listDTO);
			
	
	}
}
