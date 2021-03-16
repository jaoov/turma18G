package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
@RequestMapping("/Hallo")
public class HelloWorld2 {

	@GetMapping
	public String hello() 
	{
		return "Se aprofundar no back-end e treinar comunicação";
	}

}