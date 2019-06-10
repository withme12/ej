package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Order;

public interface IOrder {
    int insertSelective(Order record);
    int deleteByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(Order record);
    Order selectByPrimaryKey(Long id);
}
