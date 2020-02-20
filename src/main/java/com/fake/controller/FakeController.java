package com.fake.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fake.model.FakeModel;
import com.fake.service.FakeService;

import io.reactivex.Observable;

@RestController
@RequestMapping("/home")
public class FakeController {
	
	@Autowired
	FakeService fakeService;
	
	@GetMapping("/get-users")
	public Observable<FakeModel> getUsers() {
		return fakeService.getUsers();
	}

}
