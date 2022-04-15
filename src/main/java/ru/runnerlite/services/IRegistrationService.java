package ru.runnerlite.services;

import org.springframework.http.ResponseEntity;
import ru.runnerlite.entities.UserDTO;

public interface IRegistrationService {
	
	ResponseEntity<Object> register(UserDTO newUser);
}
