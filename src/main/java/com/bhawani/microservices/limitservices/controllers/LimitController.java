package com.bhawani.microservices.limitservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhawani.microservices.limitservices.beans.Limit;
import com.bhawani.microservices.limitservices.configuration.Configuration;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limit retrieveLimits() {
		
		return new Limit(configuration.getMinimum(), configuration.getMaximum());
		
	}

}
