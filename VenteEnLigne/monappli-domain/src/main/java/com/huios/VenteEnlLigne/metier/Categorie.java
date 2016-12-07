package com.huios.VenteEnlLigne.metier;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Categorie implements Serializable{

	/** Generated Serial UID. **/
	private static final long serialVersionUID = -7178292750837699142L;
	private Long idCategorie;
	private String nomCategorie;
	private String description;
	private Collection<Produit> produits;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}
	@NotEmpty
	@Size(min = 4, max = 10)
	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@OneToMany(mappedBy="categorie")
	public Collection<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
}
