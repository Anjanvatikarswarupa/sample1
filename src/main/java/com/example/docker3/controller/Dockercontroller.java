package com.example.docker3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/docker1")
public class Dockercontroller {
	@GetMapping("/home")
	public @ResponseBody String home() {
		return "THIS IS Docker HOME PAGE";
	}
}

