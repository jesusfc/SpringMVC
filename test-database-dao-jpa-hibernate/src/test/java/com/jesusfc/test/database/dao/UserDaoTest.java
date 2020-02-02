package com.jesusfc.test.database.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.BasicConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jesusfc.test.business.model.user.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:databases-configuration/db-h2-config.xml" })
public final class UserDaoTest {

	@Autowired
	private UserDao userDao;

	@BeforeClass
	public static void setUp() throws Exception {
		// Log4j configuration
		BasicConfigurator.configure();
	}	

	// @Test
	public void testInsertUser() {

		User user = new User();
		user.setNombre("abel");
		user.setApellido("Fdez");
		user.setEdad(4);
		user.setSoltero(true);
		user.setDni("45851254B");
		user.setTelefono("654852123");
		user.setEmail("abel@pruebas.com");

		// assertTrue(userDao.persist(user) == 1);
	}

	
	@Test
	public void testFindAllUsers() throws Exception {

		List<User> findAll = userDao.findAll();
		for (User user : findAll) {
			System.out.println(user.toString());
		}
		assertTrue(!findAll.isEmpty());
	}

	@Test
	public void testFindUsersById() throws Exception {
		Integer id = 2;
		Optional<User> user = userDao.findById(id);
		System.out.println(user.toString());
		assertNotNull(user);
	}
	/*
*/
	/*
	 * //@Test public void showFields() throws Exception {
	 * 
	 * User user = new User(); user.setNombre("Bruno"); user.setApellido("Fdez");
	 * user.setEdad(2); user.setSoltero(true); user.setDni("4583434B");
	 * user.setTelefono("654852123"); user.setEmail("abel@pruebas.com");
	 * 
	 * 
	 * Class<?> clazz = user.getClass(); for (Field field :
	 * clazz.getDeclaredFields()) { System.out.println(field.getName() + ", value: "
	 * + field.getAnnotations()); }
	 * 
	 * for (Method method : clazz.getDeclaredMethods()) {
	 * 
	 * if (method.getName().startsWith("get")) {
	 * System.out.println(method.getName().substring(3).toLowerCase() + " - " +
	 * method.invoke(user)); }
	 * 
	 * }
	 * 
	 * assertTrue(true); }
	 */
}
