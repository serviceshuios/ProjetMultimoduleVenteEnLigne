package com.huios.VenteEnlLigne.metier;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Commande implements Serializable{

	/** Generated Serial UID. **/
	private static final long serialVersionUID = 3193959849794121367L;
	private Long idCommande;
	private Date dateCommande;
	private User client;
	private Collection<LigneCommande> items;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
	public Date getDateCommande() {
		if(this.dateCommande == null) {
			return null;
		}
		return new Date(this.dateCommande.getTime());
	}
	public void setDateCommande(Date dateCommande) {
		if(dateCommande == null) {
			this.dateCommande = null;
		} else {
			this.dateCommande = new Date(dateCommande.getTime());
		}
	}
	
	@OneToOne(mappedBy="commandes")
	public User getClient() {
		return client;
	}
	public void setClient(User client) {
		this.client = client;
	}
	@OneToMany(mappedBy="commande")
	public Collection<LigneCommande> getItems() {
		return items;
	}
	public void setItems(Collection<LigneCommande> items) {
		this.items = items;
	}
}
