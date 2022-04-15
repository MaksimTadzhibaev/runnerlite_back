package ru.runnerlite.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.runnerlite.entities.UserDTO;
import ru.runnerlite.services.IRegistrationService;

@RestController
@RequestMapping("/register")
public class RegistrationController {
	
	@Autowired
	IRegistrationService registrationService;
	
	@PostMapping
	public ResponseEntity<Object> registerNewUser() {
		
		return registrationService.register(new UserDTO());
	}
}
