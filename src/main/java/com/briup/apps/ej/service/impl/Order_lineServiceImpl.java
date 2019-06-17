package com.briup.apps.ej.service.impl;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.Order_line;
import com.briup.apps.ej.bean.Order_lineExample;
import com.briup.apps.ej.bean.extend.Order_lineExtend;
import com.briup.apps.ej.dao.Order_lineMapper;
import com.briup.apps.ej.dao.extend.Order_lineExtendMapper;
import com.briup.apps.ej.service.IOrder_lineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Order_lineServiceImpl implements IOrder_lineService {
    @Resource
    private Order_lineMapper order_lineMapper;
    @Resource
    private Order_lineExtendMapper orderLineExtendMapper;
    @Override
    public List<Order_line> findAll() {
        Order_lineExample order_lineExample=new Order_lineExample();
        return order_lineMapper.selectByExample(order_lineExample);
    }

    @Override
    public Order_line findOrder_lineById(Long id) {
        return order_lineMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertOrUpdate(Order_line order_line) throws Exception {
        if(order_line.getId()!=null){
            order_line.setStatus("正常");
            order_lineMapper.updateByPrimaryKey(order_line);
        }
    }

    @Override
    public void deleteOrder_lineById(Long id) throws Exception {
        Order_line order_line = order_lineMapper.selectByPrimaryKey(id);
        if(order_line == null){
            throw new Exception("要删除的用户不存在");
        } else {
            order_lineMapper.deleteByPrimaryKey(id);
        }

    }

    @Override
    public void batchDelete(long[] ids) throws Exception {
        for (long id : ids){
            order_lineMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public List<Order_lineExtend> findOrderDetails(Long id) {
        return orderLineExtendMapper.findOrderDetails(id);
    }

}
