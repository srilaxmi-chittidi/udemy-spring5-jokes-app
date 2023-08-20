package com.springframework.spring5jokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.spring5jokesapp.services.JokesService;

@Controller
public class JokesController {

	private final JokesService jokesService;
	
	public JokesController(JokesService jokesService) {
		this.jokesService=  jokesService;
	}
	@RequestMapping("/")
	public String showJokes(Model model) {
		model.addAttribute("joke",jokesService.getJokesQuote());
		return "index";
	}
}
