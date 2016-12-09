package com.huios;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.huios.VenteEnLigne.dao.ProduitDao;
import com.huios.VenteEnlLigne.metier.Produit;
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
		appContext = new ClassPathXmlApplicationContext("spring/application-config.xml");

		produitDao = (ProduitDao) appContext.getBean("produitDao");
	}
    
    
    /**
     * Test la creation de la base
     */
	 @Test
    public void testCreationBase() {
    	Produit prod = new Produit();
    	prod.setDesignation("Produit test");
    	prod.setPrix(12.00);
    	prod.setDescription("Produit utilisé dans les tests");
    	produitDao.save(prod);
    	
  }
}
