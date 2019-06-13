package com.briup.apps.ej.service.impl;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.OrderExample;
import com.briup.apps.ej.dao.OrderMapper;
import com.briup.apps.ej.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {
    @Resource
    private OrderMapper orderMapper;



    @Override
    public List<Order> findAll() {
        OrderExample orderExample=new OrderExample();
        return orderMapper.selectByExample(orderExample);
    }

    @Override
    public Order findOrderById(Long id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertOrUpdate(Order order) throws Exception {
        if(order.getId()!=null){
            order.setStatus("正常");
            orderMapper.updateByPrimaryKey(order);
        }else{
            order.setStatus("正常");
            orderMapper.insert(order);
        }
    }

    @Override
    public void deleteOrderById(Long id) throws Exception {
        Order order = orderMapper.selectByPrimaryKey(id);
        if(order == null){
            throw new Exception("要删除的用户不存在");
        } else {
            orderMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void batchDelete(long[] ids) throws Exception {
    for (long id : ids){
        orderMapper.deleteByPrimaryKey(id);
        }
    }
}
