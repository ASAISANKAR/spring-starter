package com.klef.jfsd.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	
	@RequestMapping(path="/",method = RequestMethod.GET)
	public String demo1()
	{
		return "Hello SS........!!!!!!!!!!";
	}

}
