package com.huios.VenteEnlLigne.metier;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.OneToMany;

public class User implements Serializable{
	
	/** Generated Serial UID. **/
	private static final long serialVersionUID = 2733085172899919819L;
	private Long idUser;
	private String userName;
	private String password;
	private Role role;
	private String adresse;
	private String email;
	private String tel;
	private Collection<Commande> commandes;
	
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@OneToMany(mappedBy="client")
	public Collection<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}
	
}
