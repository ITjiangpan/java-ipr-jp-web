package com.ipr.jp.mapper.action;

import java.util.List;

import com.ipr.jp.dataobject.action.Activity;

public interface ActivityMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
    
    List<Activity> getAllActivities();
}