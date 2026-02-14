package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyService {

	@RequestMapping("/")
	public String hello()
	{
		return "欢迎来到GitLab CI Java服务演示!\n";
	}
	
}
