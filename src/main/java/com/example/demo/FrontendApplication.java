package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontendApplication {

	@RequestMapping("/hi")
	public String hi() {
		return "hello dangnh 68686868";
	}

}
