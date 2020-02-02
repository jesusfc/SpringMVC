package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.constant.ParameterConstants;
import com.constant.ViewConstants;
import com.exception.UserNotFoundException;
import com.jesusfc.test.business.model.user.User;
import com.jesusfc.test.service.layer.user.UserService;

@RestController
public class AngularJSController extends CommonController {

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1910912587425663261L;

	Logger log = Logger.getLogger(AngularJSController.class);

	@Autowired
	UserService userService;

	@RequestMapping(value = "angularJS", method = RequestMethod.GET)
	public ModelAndView goToAngularJSTestView() {

		ModelAndView modelAndView = new ModelAndView(ViewConstants.ANGULAR_JS_VIEW, "view", ViewConstants.ANGULAR_JS_VIEW);		

		try {
			
			System.out.println("AngularController.java - Debe tener al menos una sentencia.");
				
		} catch (Exception e) {
			log.warn("Error en AngularController: ", e);
		}

		return modelAndView;
	}
	
	@RequestMapping(value = {"/userList", "/userList/{id}"}, method = RequestMethod.GET, produces = {"application/json" })	
	public List<User> geUserLists(@PathVariable Optional<Long> id) throws Exception {
		
		List<User> usersList = null;		
		if (id.isPresent()) {			
			User user = userService.findById(String.valueOf(id.get()));
			usersList = new ArrayList<User>();
			usersList.add(user);
		} else {
			usersList = userService.loadUsers();
		}
		
		if (usersList == null) {
			throw new UserNotFoundException("User list error");
		}
		
		return usersList;
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ModelAndView handleException(UserNotFoundException e) {
		ModelAndView modelAndView = new ModelAndView(ViewConstants.USERS_VIEW);
		modelAndView.addObject(ParameterConstants.PARAM_EXCEPTION_MESSAGE, e.getMessage());
		return modelAndView;
	}
}
