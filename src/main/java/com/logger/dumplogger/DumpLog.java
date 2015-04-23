package com.logger.dumplogger;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DumpLog {
	
	private static Logger logger = LoggerFactory.getLogger(DumpLog.class);
	
	@PostConstruct
	public void dumpLog()
	{
		int i=0;
		while(true)
		{
			logger.info("Logging.................");
			i++;
			if(i==100000)
			{
				logger.info("testing...............");
				i=0;
			}
		}
	}

}
