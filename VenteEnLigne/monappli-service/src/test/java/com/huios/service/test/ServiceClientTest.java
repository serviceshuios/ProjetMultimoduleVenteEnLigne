package com.huios.service.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.transaction.annotation.Transactional;

import com.huios.VenteEnLigne.dao.UserDao;
import com.huios.service.ServiceClient;
import com.huios.service.test.ServiceClientTest;

/**
 * Unit test for simple App.
 */
@Transactional
public class ServiceClientTest
{
    @Mock
    private UserDao userDao;

    private ServiceClient serviceClient;
    
    @Before
    public void setUp() {
    	MockitoAnnotations.initMocks(userDao);
    	serviceClient = new ServiceClient();
    	serviceClient.setUserDao(userDao);
    }
    
    @Test
    public void testFindAll() {
    	serviceClient.findAll();
    	Mockito.verify(userDao).findAll();
    }
}
