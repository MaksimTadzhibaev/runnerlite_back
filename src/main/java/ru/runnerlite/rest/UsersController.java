package ru.runnerlite.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.runnerlite.entities.dto.SecUserDto;
import ru.runnerlite.services.IUserService;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	IUserService registrationService;
	
	@GetMapping("/find")
	public ResponseEntity<SecUserDto> findUser(@RequestParam(name = "id") Long id) {
		
		return registrationService.getById(id);
	}
}