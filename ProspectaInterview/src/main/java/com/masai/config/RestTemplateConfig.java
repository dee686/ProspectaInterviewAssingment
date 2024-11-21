package com.masai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class RestTemplateConfig {
	
	
	  @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate(clientHttpRequestFactory());
	    }
	  
	   private ClientHttpRequestFactory clientHttpRequestFactory() {
	        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
	        factory.setConnectTimeout(5000);  // 5 seconds connection timeout
	        factory.setReadTimeout(5000);     // 5 seconds read timeout
	        return factory;
	    }

}
