package com.springboot.app.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppController {

	// JAVA 8 Optional has many feature one of then is the optional.map and alse
	// possible to return in null cases or throw an error, if it doesn't met with
	// the criteria
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getCustomerBillTo() {
		Optional<String> response = Optional.of("Sample Response");
		return response.map(String::toUpperCase).orElse("Error resnponse");
	}

}
