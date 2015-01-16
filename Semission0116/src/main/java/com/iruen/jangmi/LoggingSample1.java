package com.iruen.jangmi;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class LoggingSample1
{
	public void initLogging()
	{
		// Create important components
		Logger logger = Logger.getLogger(LoggingSample1.class);
		DailyRollingFileAppender appender = new DailyRollingFileAppender();
		PatternLayout layout = new PatternLayout();

		// Configure layout object
		String layoutPattern = "[%d{yyyy/MM/dd HH:mm:ss}] %5p %c %M : %m%n";
		layout.setConversionPattern(layoutPattern);

		// Configure appender object
		//String filePath = "C:\\Users\\iruentech2\\semi.log";
		String datePattern = "'.,'yyyy-MM-dd";
		appender.setName("GilbutAppender");
		//appender.setFile(filePath);
		appender.setLayout(layout);
		appender.setDatePattern(datePattern);
		appender.setBufferSize(1024);
		appender.activateOptions();

		// Configure logger object.
		logger.addAppender(appender);

		// Test logging
		logger.debug("Log for debugging");
		logger.info("Log for information");
		logger.warn("Log for warnning");
		logger.error("Log for error");
		logger.fatal("Log for fatal error");
	}
}
