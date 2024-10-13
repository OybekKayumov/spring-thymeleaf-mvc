package com.ok.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class MyController {

	@GetMapping("/")
	public String helloWorld(Model model) {
		model.addAttribute("today", LocalDate.now().toString());
		return "helloworld";
	}
}
