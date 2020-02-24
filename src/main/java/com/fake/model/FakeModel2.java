package com.fake.model;

import org.springframework.stereotype.Component;

@Component
public class FakeModel2 {
	
	private String first_name;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
}
