package com.fake.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fake.service.FakeService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/home")
public class FakeController {
	
	@Autowired
	FakeService fakeService;
	
	@GetMapping("/get-fake")
	public Flux<Object> fake() {
		return fakeService.getFake();
	}
	
	@GetMapping("/get-fake2/{id}")
	public Flux<Object> fake2(@PathVariable String id) {
		return fakeService.getFake2(id);
	}

}
