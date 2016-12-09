package com.huios;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.huios.VenteEnLigne.dao.ProduitDao;
import com.huios.VenteEnLigne.dao.UserDao;
import com.huios.VenteEnlLigne.metier.Produit;
import com.huios.VenteEnlLigne.metier.User;

/**
 * Unit test for user.
 */
@Transactional
public class UserTest {

	private static User user;
	private static UserDao userDao;
	private static ClassPathXmlApplicationContext appContext;
	
	@BeforeClass
	public static void setUp() throws Exception {
		user = new User();
		appContext = new ClassPathXmlApplicationContext("spring/application-config.xml");

		userDao = (UserDao) appContext.getBean("userDao");
	}
    
    /**
     * Test la creation de la base
     */
	 @Test
    public void testCreationBase() {
    	User usr = new User();
    	usr.setEmail("user@test.fr");
    	usr.setPassword("testPWD");
    	usr.setAdresse("rue du test");
    	userDao.save(usr);
  }
}
