package com.huios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huios.VenteEnlLigne.metier.User;
import com.huios.service.IServiceClient;

@RestController
public class UserController {

	/** Client's service. */
	@Autowired
	private IServiceClient serviceClient;
	
	/** Constant use for test. */
	private static final String TEST= "test";
	
	@RequestMapping("/test")
	public String test() {
		return TEST;
	}
	
	@RequestMapping("all")
	public List<User> getUsers() {
		return serviceClient.findAll();
	}
}
