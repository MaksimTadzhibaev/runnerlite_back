package ru.runnerlite.entities.dto;

import java.util.List;

/**
 * DTO для раздела "Статус набора команды волонтёров" в кабинете руководителя забегов
 */
public class RunningPrepareStatus {
	
	private TeamsRunningCountDto running;
	private List<TeamsVolunteerDto> needVolunteers;
	private List<VolunteerSimpleDto> volunteers;
	private Integer recruitmentPercentage;
	
	public RunningPrepareStatus() {
	}
	
	public TeamsRunningCountDto getRunning() {
		return running;
	}
	
	public void setRunning(TeamsRunningCountDto running) {
		this.running = running;
	}
	
	public List<TeamsVolunteerDto> getNeedVolunteers() {
		return needVolunteers;
	}
	
	public void setNeedVolunteers(List<TeamsVolunteerDto> needVolunteers) {
		this.needVolunteers = needVolunteers;
	}
	
	public List<VolunteerSimpleDto> getVolunteers() {
		return volunteers;
	}
	
	public void setVolunteers(List<VolunteerSimpleDto> volunteers) {
		this.volunteers = volunteers;
	}

	public Integer getRecruitmentPercentage() {
		return recruitmentPercentage;
	}
	
	public void setRecruitmentPercentage(Integer recruitmentPercentage) {
		this.recruitmentPercentage = recruitmentPercentage;
	}
}
