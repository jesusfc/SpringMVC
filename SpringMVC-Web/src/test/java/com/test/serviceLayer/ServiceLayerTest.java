package com.test.serviceLayer;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jesusfc.test.business.model.user.User;
import com.jesusfc.test.service.layer.user.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-configuration/applicationContext.xml" })								
public class ServiceLayerTest {

	@Autowired
	UserService userService;
	
	@Test
	public final void loadUsersTest() {
		List<User> loadUsers = userService.loadUsers();
		System.out.println(loadUsers.toString());
		assertTrue(!loadUsers.isEmpty());
	}
}
