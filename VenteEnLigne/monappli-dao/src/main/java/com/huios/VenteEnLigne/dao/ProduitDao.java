package com.huios.VenteEnLigne.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.huios.VenteEnlLigne.metier.Produit;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long>{
	
	List<Produit> findProduitByDesignation(String designation);
	@Query("select p from Produit p where p.description like:X")
	List<Produit> findByDescription(@Param("X") String desc);
}
