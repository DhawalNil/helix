package com.infy.reducer.entity;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class Person {
	private String name ;
	private String project;
	private String hobby;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
