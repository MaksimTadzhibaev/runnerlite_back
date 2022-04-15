package ru.runnerlite.entities;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "ref_ages_category")
public class RefAgesCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private Integer id;
	
	@Column(name = "CODE", nullable = false, length = 7)
	private String code;
	
	@Column(name = "DESCRIPTION", nullable = false, length = 200)
	private String description;
	
	@Column(name = "AGE_FROM", nullable = false)
	private Integer ageFrom;
	
	@Column(name = "AGE_TO", nullable = false)
	private Integer ageTo;
	
	@Lob
	@Column(name = "SEX", nullable = false)
	private String sex;
	
	public Integer getId() {
		return id;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Integer getAgeFrom() {
		return ageFrom;
	}
	
	public Integer getAgeTo() {
		return ageTo;
	}
	
	public String getSex() {
		return sex;
	}
	
}