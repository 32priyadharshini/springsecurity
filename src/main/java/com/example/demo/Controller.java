package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Value("${enviroment}")
	String enviroment;
	@GetMapping("/get")
	public String get() {
		return enviroment;
	}
	

}
