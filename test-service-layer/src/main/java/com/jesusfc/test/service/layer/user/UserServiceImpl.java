package com.jesusfc.test.service.layer.user;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesusfc.test.business.model.user.User;
import com.jesusfc.test.database.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDao userDao;

	public List<User> loadUsers() {

		try {
			return userDao.findAll();
		} catch (Exception e) {
			logger.warn("Error al obtener el litado users", e);
		}
		return null;
	}

	public void insertUser(User user) {
		try {
			userDao.save(user);
		} catch (Exception e) {
			logger.error("Error al insertar un usuario", e);
		}
	}

	public User findById(String id) {

		try {			
			Optional<User> b = userDao.findById(Integer.parseInt(id));
			return b.get();
		} catch (Exception e) {
			logger.error("Error al obtener un user", e);
		}
		return null;
	}

	public void update(User user) {
		// TODO Auto-generated method stub

	}

	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
