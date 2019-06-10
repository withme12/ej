package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Order_line;

public interface IOrder_line {
    int deleteByPrimaryKey(Long id);
    int updateByPrimaryKey(Order_line record);
    int insert(Order_line record);
    Order_line selectByPrimaryKey(Long id);
}
