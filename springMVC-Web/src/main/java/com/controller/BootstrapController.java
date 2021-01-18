package com.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.constant.ViewConstants;

@RestController
public class BootstrapController extends CommonController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4193799096567027529L;
	
	Logger log = Logger.getLogger(BootstrapController.class);

	
	@RequestMapping(value = "bootstrapTest", method = RequestMethod.GET)
	public ModelAndView goToBootstrapTestView() {

		ModelAndView modelAndView = new ModelAndView(ViewConstants.BOOTSTRAP_VIEW, "view", ViewConstants.BOOTSTRAP_VIEW);		

		try {
			
			
			
			
			
				
		} catch (Exception e) {
			log.warn("Error en BootstrapController: ", e);
		}

		return modelAndView;
	}

}
