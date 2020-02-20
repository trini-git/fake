package com.fake.service;

import com.fake.model.FakeModel;

import io.reactivex.Observable;

public interface IFakeService {
	
	Observable<FakeModel> getUsers();

}
