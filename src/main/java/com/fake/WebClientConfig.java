package com.fake;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

	@Bean
	@Qualifier("fake")
	public WebClient fakeWebClient() {
		
		return WebClient.create("https://reqres.in/api");
		
	}
}
