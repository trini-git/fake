package com.fake.service;

import reactor.core.publisher.Flux;

public interface IFakeService {
	
	Flux<Object> getFake();
	Flux<Object> getFake2(String id);

}
