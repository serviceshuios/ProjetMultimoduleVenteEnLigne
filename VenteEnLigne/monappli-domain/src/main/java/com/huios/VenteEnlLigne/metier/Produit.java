package com.huios.VenteEnlLigne.metier;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Produit implements Serializable{

	
	/** Generated Serial UID. **/
	private static final long serialVersionUID = -4321588608482174621L;
	private Long idProduit;
	private String designation;
	private String description;
	private Double prix;
	private Integer quantite;
	private Boolean selectionne;
	private Categorie categorie;
	private Collection<LigneCommande> items;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	public Boolean getSelectionne() {
		return selectionne;
	}
	public void setSelectionne(Boolean selectionne) {
		this.selectionne = selectionne;
	}
	@ManyToOne
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	@OneToMany(mappedBy = "produit")
	public Collection<LigneCommande> getItems() {
		return items;
	}
	public void setItems(Collection<LigneCommande> items) {
		this.items = items;
	}
}
