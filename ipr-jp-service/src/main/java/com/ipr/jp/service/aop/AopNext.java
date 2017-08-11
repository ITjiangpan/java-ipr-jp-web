package com.ipr.jp.service.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**     
 *
 * @author jiangpan 
 * @title AopNext.java
 * @date 2017年8月11日 
 *     
 */
@Aspect
@Component
@Order(2)
public class AopNext {

	private static final Logger logger = LoggerFactory.getLogger(AopNext.class);
	@Around("execution(* com.ipr.jp.service..*.*(..))")
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		logger.info("aop two start...");
		pjp.proceed();
		logger.info("aop two end...");
	}
}
