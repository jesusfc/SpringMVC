package com.jesusfc.test.service.layer.user;

import java.util.List;

import com.jesusfc.test.business.model.user.User;

public interface UserService {

	List<User> loadUsers();

	User findById(String id);

	void insertUser(User user);

	void update(User user);

	void delete(Long id);

}
