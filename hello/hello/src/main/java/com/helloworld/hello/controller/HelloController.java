package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
@RequestMapping("/Hallo")
public class HelloController {

	@GetMapping
	public String hello1() 
	{
		return "HelloGeneration!!";
	}

}
