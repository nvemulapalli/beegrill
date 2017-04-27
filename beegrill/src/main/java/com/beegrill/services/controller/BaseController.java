package com.beegrill.services.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beegrill.services.constants.ServiceRouter;
import com.beegrill.services.responses.impl.Ping;

@Controller
public class BaseController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);
	
	@RequestMapping(value = ServiceRouter.PING, method = RequestMethod.GET)
	public @ResponseBody Ping ping() {
		LOGGER.debug("Start ping service");
		
		Ping pingResponse = new Ping();

		LOGGER.debug("End ping service");
		return pingResponse;
	}

}
