package ru.runnerlite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnerLiteStart {
	
	public static void main(String[] args) {
		SpringApplication.run(RunnerLiteStart.class, args);
		
		/*
		User user = new User(0L, "runner@lite.ru", "Иванов Иван Иванович", "Хэшированный пароль",
			null, true, true, 1L, new Date(System.currentTimeMillis()), Gender.MALE);
		 */
	}
}
