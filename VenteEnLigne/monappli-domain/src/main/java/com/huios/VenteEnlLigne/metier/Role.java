package com.huios.VenteEnlLigne.metier;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Role implements Serializable {
	
	/** Serial UID. */
	private static final long serialVersionUID = -1331106387025327730L;
	private Long idRole;
	private String nomRole;
	private Collection<User> users;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdRole() {
		return idRole;
	}
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}
	public String getNomRole() {
		return nomRole;
	}
	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}
	public Collection<User> getUsers() {
		return users;
	}
	public void setUsers(Collection<User> users) {
		this.users = users;
	}
	
}
