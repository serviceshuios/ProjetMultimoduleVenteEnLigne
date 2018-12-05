package com.huios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.huios.VenteEnLigne.dao.UserDao;
import com.huios.VenteEnlLigne.metier.User;

@Service
public class ServiceClient implements IServiceClient {

	@Autowired
	private UserDao userDao;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void createOrUpdateUser(User user) {
		userDao.save(user);
	}

	/**
	 * @return the userDao
	 */
	public final UserDao getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public final void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
