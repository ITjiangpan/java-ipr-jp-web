package com.ipr.jp.test.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ipr.jp.service.demo.IDemoService;
import com.ipr.jp.test.TestBaseForMockito;

/**     
 *
 * @author jiangpan 
 * @title DemoTest.java
 * @date 2017年8月3日 
 *     
 */
public class DemoServiceTest extends TestBaseForMockito{

	@Autowired
	private IDemoService demoService;
	
	@Test
	public void testDemoService(){
		demoService.demoServiceMethod();
	}
}