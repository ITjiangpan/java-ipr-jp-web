package com.ipr.jp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ipr.jp.service.demo.IDemoService;

/**     
 *
 * @author jiangpan 
 * @title ControllerDemo.java
 * @date 2017年8月3日 
 *     
 */

@Controller
@RequestMapping("/controller")
public class ControllerDemo {

	private static final Logger logger = LoggerFactory.getLogger(ControllerDemo.class);
	@Autowired
	private IDemoService demoService;
	
	@RequestMapping("/helloworld")
	@ResponseBody
	public String helloWorld(){
		return new String("HELLOWORLD");
	}
	
	@RequestMapping("/demoservice")
	@ResponseBody
	public String demoService(){
		try {
			demoService.demoServiceMethod();
		} catch (Exception e) {
			logger.error("demoservice error[{}]", e.getMessage());
			return new String("FAILED");
		}
		return new String("SUCCESS");
	}
}
