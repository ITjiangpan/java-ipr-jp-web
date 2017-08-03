package com.ipr.jp.test;

import java.io.FileNotFoundException;

import org.junit.runners.model.InitializationError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

/**     
 *	解决log4j.xml必须放在resource根目录下问题的工具类
 * @author jiangpan 
 * @title JUnit4ClassRunner.java
 * @date 2017年8月3日 
 *     
 */
public class JUnit4ClassRunner extends SpringJUnit4ClassRunner{

	private static final Logger logger = LoggerFactory.getLogger(JUnit4ClassRunner.class);
	static {  
        try {  
            Log4jConfigurer.initLogging("classpath:config/log4j.xml");  
        } catch (FileNotFoundException ex) { 
        	ex.printStackTrace();
        	System.out.println("error");
        	logger.error("Cannot Initialize log4j");  
        }  
    }  
	
	public JUnit4ClassRunner(Class<?> clazz) throws InitializationError {
		super(clazz);
	}

	
}
