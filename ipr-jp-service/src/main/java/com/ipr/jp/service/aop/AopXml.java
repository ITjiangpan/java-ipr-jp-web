package com.ipr.jp.service.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**     
 *
 * @author jiangpan 
 * @title AopXml.java
 * @date 2017年8月11日 
 *     
 */
@Component("aopXml")
public class AopXml {

	private static final Logger logger = LoggerFactory.getLogger(AopXml.class);
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		logger.info("aop three...");
		pjp.proceed();
	}
}
