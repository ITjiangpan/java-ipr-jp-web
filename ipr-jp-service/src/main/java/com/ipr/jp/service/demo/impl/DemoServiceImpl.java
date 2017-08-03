package com.ipr.jp.service.demo.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ipr.jp.service.demo.IDemoService;

/**     
 *
 * @author jiangpan 
 * @title DemoServiceImpl.java
 * @date 2017年8月3日 
 *     
 */
@Service
public class DemoServiceImpl implements IDemoService{

	private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);
	@Override
	public void demoServiceMethod() {
		
		logger.info("this is demo service method");
	}

}
