package com.jesusfc.test.database;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public abstract class DataBaseAccess {

	@Autowired
	private DataSource					dataSource;
	

	private NamedParameterJdbcTemplate	namedParameterJdbcTemplate;

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		if (namedParameterJdbcTemplate == null) {
			this.setNamedParameterJdbcTemplate(new NamedParameterJdbcTemplate(dataSource));
		}
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.setNamedParameterJdbcTemplate(new NamedParameterJdbcTemplate(dataSource));
	}
	
}
