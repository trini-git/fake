package com.fake.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fake.model.FakeModel;
import com.fake.model.FakeModel2;

import io.reactivex.Observable;
import reactor.core.publisher.Flux;

@Service
public class FakeService implements IFakeService {
	
	@Autowired
	FakeModel fakeModel;
	
	@Autowired
	FakeModel2 fakeModel2;
	
	@Autowired
	@Qualifier("fake")
	WebClient client;
	
	  public Flux<Object> fake() {
//		    Map<String, Object> param = new HashMap<String, Object>();
//		    param.put("accountNumber", accountNumber);
		    return client.get()
		.uri("?page=2")
		.accept(MediaType.APPLICATION_JSON_UTF8)
		.retrieve()
		.bodyToFlux(Object.class);
		//.bodyToMono(Object.class)
		
	  }
	  
	  public Flux<Object> fake2(String id) {
	    Map<String, Object> param = new HashMap<String, Object>();
		    param.put("id", id);
		    return client.get()
		.uri("/{id}",param)
		.accept(MediaType.APPLICATION_JSON_UTF8)
		.retrieve()
		.bodyToFlux(Object.class);
		
	  }

	@Override
	public Flux<Object> getFake() {
		
		return fake();
	}

	@Override
	public Flux<Object> getFake2(String id) {
		
		return fake2(id);
	}		
}
