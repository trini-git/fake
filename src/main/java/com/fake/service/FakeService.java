package com.fake.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fake.model.FakeModel;

import io.reactivex.Observable;

@Service
public class FakeService implements IFakeService {
	
	@Autowired
	FakeModel fakeModel;
		
	@Override
	public Observable<FakeModel> getUsers() {
		return Observable.just(fakeModel);
		
	}
	
}
