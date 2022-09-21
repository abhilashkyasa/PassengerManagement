package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	@GetMapping("/ArrayList")
	public String Hii() {
		return "Welcome to Mindtree";
	}

}
