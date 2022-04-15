package ru.runnerlite.entities.dto;

import lombok.Data;
import ru.runnerlite.entities.dto.SecUserDto;

import java.io.Serializable;

@Data
public class PhoneNumberDto implements Serializable {
	private final Integer id;
	private final SecUserDto secUsers;
	private final String phoneNumber;
	private final String type;
}
