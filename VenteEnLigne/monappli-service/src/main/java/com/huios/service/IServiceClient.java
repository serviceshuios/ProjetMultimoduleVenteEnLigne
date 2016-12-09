package com.huios.service;

import java.util.List;

import com.huios.VenteEnlLigne.metier.User;

public interface IServiceClient {

	/**
	 * @return the list f all users
	 */
	public List<User> findAll();
	
	/**
	 * Create or update an user in database
	 * @param user to create
	 */
	public void createOrUpdateUser(User user);
}
