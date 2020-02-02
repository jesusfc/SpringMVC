package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.constant.ViewConstants;
import com.jesusfc.test.business.model.user.User;
import com.jesusfc.test.service.layer.user.UserServiceImpl;
import com.validator.UserValidator;

@Controller("CheckFormController")
public class CheckFormController extends CommonController {
	
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = -3996841378670235815L;
	Logger log = Logger.getLogger(CheckFormController.class);
	
	/**
	 * Validador de datos para el formulario de User
	 */
	@Autowired
	private UserValidator userValidator;
	
	@Autowired
	private UserServiceImpl userServices;

	/**
	 * Iniciamos el validador del User
	 * @param binder
	 */
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.addValidators(userValidator);
	}	

	@RequestMapping(value = "/" + ViewConstants.CHECK_FORM_VIEW, method = RequestMethod.GET)
	public ModelAndView goToView() {

		ModelAndView modelAndView = new ModelAndView(ViewConstants.CHECK_FORM_VIEW, "view", ViewConstants.CHECK_FORM_VIEW);

		try {

			List<User> users = userServices.loadUsers();
			modelAndView.addObject("users", users);
			modelAndView.addObject("user", new User());

		} catch (Exception e) {
			log.warn("Error en CheckFormController: ", e);
		}

		return modelAndView;
	}

	@RequestMapping(value = "/" + ViewConstants.CHECK_FORM_VIEW, method = RequestMethod.POST)
	public ModelAndView goToSaveFormView(final HttpServletRequest request,
			@ModelAttribute("user") @Validated User user, BindingResult bindingResult) {

		ModelAndView modelAndView = new ModelAndView(ViewConstants.CHECK_FORM_VIEW, "view", ViewConstants.CHECK_FORM_VIEW);		

		try {

			if (!bindingResult.hasErrors()) {
				
				System.out.println("Insert new user: " + user.getNombre());
				userServices.insertUser(user);
				
			} else {
				
				for (FieldError error : bindingResult.getFieldErrors()) {
					log.warn("goToCheckFormToSave: " + error.getObjectName() + " - " + error.getDefaultMessage());
				}
				
			}

			List<User> users = userServices.loadUsers();
			modelAndView.addObject("users", users);

		} catch (Exception e) {
			log.warn("Error en CheckFormController: ", e);
		}

		return modelAndView;
	}

}
