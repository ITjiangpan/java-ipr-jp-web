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
 * @title AopDemo.java
 * @date 2017年8月3日 
 *     
 */
@Aspect
@Component
@Order(1)
public class AopDemo {

	private static final Logger logger = LoggerFactory.getLogger(AopDemo.class);
	
	/*@Pointcut("execution(* com.ipr.jp.service..*.*(..))")
	public void AopTest(){
		
	}*/
	
	@Around("execution(* com.ipr.jp.service..*.*(..))")
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		logger.info("aop one start...");
		//执行方法
		pjp.proceed();
		
		logger.info("aop one end...");
	}
}
