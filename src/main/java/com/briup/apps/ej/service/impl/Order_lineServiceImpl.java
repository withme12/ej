package com.briup.apps.ej.service.impl;

import com.briup.apps.ej.bean.Order_line;
import com.briup.apps.ej.dao.Order_lineMapper;
import com.briup.apps.ej.service.IOrder_line;
import org.springframework.stereotype.Service;

@Service
public class Order_lineServiceImpl implements IOrder_line {
    private Order_lineMapper order_lineMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Order_line record) {
        return 0;
    }

    @Override
    public int insert(Order_line record) {
        return 0;
    }

    @Override
    public Order_line selectByPrimaryKey(Long id) {
        return null;
    }
}
