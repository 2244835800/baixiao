package com.jingyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {
	@GetMapping(value = "/")
	public String test(Model model) {
		return "test";
	}
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
}
