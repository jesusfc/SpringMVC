package com.test.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

import com.constant.ViewConstants;
import com.controller.UserController;
import com.jesusfc.test.business.model.user.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-configuration/applicationContext.xml" })
public class UserControllerTest {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testHandleRequestView() throws Exception {
		UserController userController = new UserController();
		applicationContext.getAutowireCapableBeanFactory().autowireBean(userController);
		ModelAndView modelAndView = userController.goToLoadUsers();
		assertEquals(ViewConstants.USERS_VIEW, modelAndView.getViewName());
		assertNotNull(modelAndView.getModel());
		@SuppressWarnings("unchecked")
		List<User> nowValue = (ArrayList<User>) modelAndView.getModel().get("users");
		assertNotNull(nowValue);
	}
	
}

