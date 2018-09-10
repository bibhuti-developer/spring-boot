package com.bsa.spring5entity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.bsa.spring5entity.repositories.AuthorRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AuthorController {
	private AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}

	@RequestMapping(value="/authors", method=RequestMethod.GET)
	public String requestMethodName(Model model) {
		model.addAttribute("", authorRepository.findAll()); 
		return "authors";
	}
	
}
