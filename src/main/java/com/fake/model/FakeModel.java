package com.fake.model;

import org.springframework.stereotype.Component;

@Component
public class FakeModel {
	
	private String name;
	
	

	public FakeModel() {
		
		this.name = "Pablo Trinidad";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
