package com.huios.VenteEnLigne.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huios.VenteEnlLigne.metier.Produit;

public interface ProduitDao extends JpaRepository<Produit, Long>{
	
}
