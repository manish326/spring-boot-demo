package com.luv2code.springboot.demo.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
		
	// expose "/" that return "Hello World"
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello India! Time on server is " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getworkout() {
		return "Hello India! run daily 5 kilometers";
	}
	
	@GetMapping("/teamInfo")
	public String getTeamInfo() {
		return "Coach:"+coachName+". Team: "+teamName;
	}
	
}












