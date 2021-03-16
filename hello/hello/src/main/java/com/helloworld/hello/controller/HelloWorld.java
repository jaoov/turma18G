package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
@RequestMapping("/Hallo")
public class HelloWorld {

	@GetMapping
	public String hello() 
	{
		return "Persistência e Atenção aos Detalhes!";
	}

}