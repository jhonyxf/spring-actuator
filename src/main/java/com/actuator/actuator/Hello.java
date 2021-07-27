package com.actuator.actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Hello {

	@GetMapping
	public String greeting() {
		return "hello actuatooorzao";
	}
}