package com.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.constant.ParameterConstants;
import com.constant.ViewConstants;
import com.exception.UserNotFoundException;
import com.jesusfc.test.business.model.user.User;
import com.jesusfc.test.service.layer.user.UserService;

@Controller("UserController")
public class UserController extends CommonController {

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = -5108229325995337851L;
	Logger log = Logger.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@RequestMapping(value = "loadUsers", method = RequestMethod.GET)
	public ModelAndView goToLoadUsers() throws Exception {

		ModelAndView modelAndView = new ModelAndView(ViewConstants.USERS_VIEW, "view", ViewConstants.USERS_VIEW);	

		final List<User> users = userService.loadUsers();
		if (users == null) {
			throw new UserNotFoundException("User list error");
		}
		
		log.info("LISTADO DE USUARIOS: " + users);
		System.out.println(users);

		modelAndView.addObject("users", users);

		return modelAndView;
	}

	@ExceptionHandler(UserNotFoundException.class)
	public ModelAndView handleException(UserNotFoundException e) {
		ModelAndView modelAndView = new ModelAndView(ViewConstants.USERS_VIEW);
		modelAndView.addObject(ParameterConstants.PARAM_EXCEPTION_MESSAGE, e.getMessage());
		return modelAndView;
	}

}
