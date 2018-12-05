package com.huios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huios.VenteEnlLigne.metier.User;
import com.huios.service.IServiceClient;

@Controller
@RequestMapping("/user")
public class UserController {

	/** Client's service. */
	@Autowired
	private IServiceClient serviceClient;

	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("users", serviceClient.findAll());
		model.addAttribute("user", new User());
		return "user";
	}

	
	@RequestMapping("/all")
	public List<User> getUsers() {
		return serviceClient.findAll();
	}
}
