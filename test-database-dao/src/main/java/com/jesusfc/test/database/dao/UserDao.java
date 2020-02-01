package com.jesusfc.test.database.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jesusfc.test.business.model.user.User;
import com.jesusfc.test.database.AbstractDao;

@Repository
public class UserDao extends AbstractDao<User> {

	private static String tableObj = "USERS";

	@Override
	public String getBussinessObjTable() {
		return tableObj;
	}

	@Override
	public RowMapper<User> getBussinessObjTableMapper() {
		return new ObjMapper();
	}

	/**
	 * Obj Mapper
	 *
	 */
	private static final class ObjMapper implements RowMapper<User> {
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setNombre(rs.getString("nombre"));
			user.setApellido(rs.getString("apellido"));
			user.setEdad(rs.getInt("edad"));
			user.setSoltero(rs.getBoolean("soltero"));
			user.setDni(rs.getString("dni"));
			user.setTelefono(rs.getString("telefono"));
			user.setEmail(rs.getString("email"));

			return user;
		}
	}

}
