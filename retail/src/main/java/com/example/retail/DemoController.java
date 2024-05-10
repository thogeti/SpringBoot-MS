package com.example.retail;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
	@GetMapping("/getDemoData")
	public String getDemoData() {
		return "SpringBoot Welcome";
	}
}
