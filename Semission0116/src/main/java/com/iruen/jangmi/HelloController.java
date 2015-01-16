package com.iruen.jangmi;

import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloController {
	private Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping(value="user",method=RequestMethod.POST)
	public String showuser(String id){
		logger.info("Welcome home! The client locale is {}.", id);
		logger.debug("Log for debugging");
		logger.info("Log for information");
		logger.warn("Log for warnning");
		logger.error("Log for error");
	
		LoggingSample1 sample = new LoggingSample1();
		sample.initLogging();
		
		LoggingSample2 sample2 = new LoggingSample2();
		sample2.logging();
		
		return "hellouser";
	}
	
}
