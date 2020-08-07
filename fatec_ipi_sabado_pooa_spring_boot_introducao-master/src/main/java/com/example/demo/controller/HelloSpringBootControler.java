package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringBootControler {

	@GetMapping("/hello")
	public String qualquerCoisa() {
		return "hello_spring_boot";
		
	}
}
