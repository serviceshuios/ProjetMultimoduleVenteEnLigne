package com.huios.VenteEnLigne.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huios.VenteEnlLigne.metier.User;

public interface UserDao extends JpaRepository<User, Long>{

}
