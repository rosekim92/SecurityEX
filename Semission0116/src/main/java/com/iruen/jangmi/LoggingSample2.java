package com.iruen.jangmi;

import org.apache.log4j.Logger;

public class LoggingSample2
{
	private static Logger logger = Logger.getLogger(LoggingSample2.class);

	public void logging()
	{
		logger.debug("Log for debugging");
		logger.info("Log for information");
		logger.warn("Log for warnning");
		logger.error("Log for error");
		logger.fatal("Log for fatal error");
	}
}
