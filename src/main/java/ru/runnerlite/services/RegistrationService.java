package ru.runnerlite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.runnerlite.entities.User;
import ru.runnerlite.entities.UserDTO;
import ru.runnerlite.repositories.UsersRepository;

@Service
public class RegistrationService implements IRegistrationService {
	
	@Autowired
	UsersRepository usersRepository;
	
	@Override
	public ResponseEntity<Object> register(UserDTO User) {
		
		User user = usersRepository.save(new User());
		return ResponseEntity.ok(user);
	}
}
