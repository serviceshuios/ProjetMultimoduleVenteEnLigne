package com.huios.VenteEnlLigne.metier;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity	
public class LigneCommande implements Serializable{

	
	/** Generated Serial UID. **/
	private static final long serialVersionUID = -5845930860053732099L;
	private Long id;
	private Produit produit;
	private Integer quantite;
	private Double prix;
	private Commande commande;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne
	@JoinColumn(name="idProduit")
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	@ManyToOne
	@JoinColumn(name="idCommande")
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}	
}
