package com.huios;

import com.huios.VenteEnLigne.dao.ProduitDao;
import com.huios.VenteEnlLigne.metier.Produit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	ProduitDao produitDao;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    /**
     * Test la creation de la base
     */
    public void testCreationBase() {
    	Produit prod = new Produit();
    	prod.setDesignation("Produit test");
    	prod.setPrix(12.00);
    	prod.setDescription("Produit utilisé dans les tests");
    	
    	this.produitDao.save(prod);
    }
}
