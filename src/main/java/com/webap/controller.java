package com.webap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping(value="/getvalues")
	public String get() {
		return "name";
	}

}
