package ru.runnerlite.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import ru.runnerlite.util.Gender;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "SEC_USERS")
@Data
@NoArgsConstructor
public class User {

	@Id
	@Column(name = "ID")
	private Long id;
	
	@Email
	@Column(name = "NAME_EMAIL")
	private String email;
	
	@Column(name = "FULLNAME")
	@NotBlank
	private String fullName;
	
	@NotNull
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "NICK_NAME")
	private String nickName;
	
	@NotNull
	@Column(name = "ACTIVE")
	private boolean isActive;
	
	@NotNull
	@Column(name = "USE_NICK")
	private boolean useNick;
	
	@NotNull
	@Column(name = "TEAMS_ID")
	private Long team;
	
	@DateTimeFormat
	@Column(name = "BIRTHDAY")
	private Date dateOfBirth;
	
	@NotNull
	@Column(name = "SEX")
	private Gender gender;
	
	public User(Long id, String email, String fullName, String password, String nickName, boolean isActive, boolean useNick, Long team, Date dateOfBirth, Gender gender) {
		this.id = id;
		this.email = email;
		this.fullName = fullName;
		this.password = password;
		this.nickName = nickName;
		this.isActive = isActive;
		this.useNick = useNick;
		this.team = team;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}
}
