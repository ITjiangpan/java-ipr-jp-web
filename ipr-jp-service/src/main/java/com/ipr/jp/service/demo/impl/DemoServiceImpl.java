package com.ipr.jp.service.demo.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.ipr.jp.biz.action.IActivityBiz;
import com.ipr.jp.dataobject.action.Activity;
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
	@Autowired
	private IActivityBiz activityBiz;
	@Override
	public void demoServiceMethod() {
		List<Activity> list = activityBiz.getActivityList();
		logger.info(JSON.toJSONString(list));
		logger.info("this is demo service method");
	}

}
