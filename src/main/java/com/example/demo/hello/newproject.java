package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class newproject {
	@RequestMapping("/hello")
	public String sayhii() {
		
		return"hello";
	}
}
