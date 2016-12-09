package com.huios;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.huios.VenteEnLigne.dao.ProduitDao;
import com.huios.VenteEnlLigne.metier.Produit;

import static org.junit.Assert.*;

import org.junit.*;


/**
 * Unit test for simple App.
 */
@Transactional
public class AppTest  {

	private static Produit produit;
	private static ProduitDao produitDao;
	private static ClassPathXmlApplicationContext appContext;
	

	@BeforeClass
	public static void setUp() throws Exception {
		produit = new Produit();
    	produit.setDesignation("Produit test");
    	produit.setPrix(12.00);
    	produit.setDescription("Produit utilisé dans les tests");
		appContext = new ClassPathXmlApplicationContext("spring/application-config.xml");

		produitDao = (ProduitDao) appContext.getBean("produitDao");
	}
    
    
    /**
     * Test la creation de la base
     */
	 @Test
    public void testCreationBase() {
    	produitDao.save(produit);
    	assertFalse(produitDao.findProduitByDesignation(produit.getDesignation()).isEmpty());
    	assertFalse(produitDao.findByDescription(produit.getDescription()).isEmpty());
    	
  }
}
