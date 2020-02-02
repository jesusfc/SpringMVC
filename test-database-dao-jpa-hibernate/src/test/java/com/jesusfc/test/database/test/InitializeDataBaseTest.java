package com.jesusfc.test.database.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/databases-configuration/db-h2-config.xml")
public class InitializeDataBaseTest {

	@Autowired
	private DataSource dataSource;
	
	@Test
	public void shouldConnectDataSourceH2() throws SQLException {
		Connection connection = dataSource.getConnection();
		assertFalse(connection.isClosed());
		connection.close();
		assertTrue(connection.isClosed());
	}
	
}
