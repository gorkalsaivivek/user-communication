package com.user.communication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCommunicationController {
	
	@GetMapping("/testcommunication")
	public String testResponse() {

		return "Response Hard Coded! from User Communication";
	}
	

}
