package com.ipr.jp.biz.action.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipr.jp.biz.action.IActivityBiz;
import com.ipr.jp.dataobject.action.Activity;
import com.ipr.jp.mapper.action.ActivityMapper;

/**     
 *
 * @author jiangpan 
 * @title ActivityBizImpl.java
 * @date 2017年8月4日 
 *     
 */
@Service
public class ActivityBizImpl implements IActivityBiz{

	@Autowired
	private ActivityMapper activityMapper;
	
	@Override
	public List<Activity> getActivityList() {
		List<Activity> list= activityMapper.getAllActivities();
		return list;
	}

}
