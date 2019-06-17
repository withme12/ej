package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.Order_line;
import com.briup.apps.ej.bean.extend.Order_lineExtend;

import java.util.List;

public interface IOrder_lineService {
//    int deleteByPrimaryKey(Long id);
//    int updateByPrimaryKey(Order_line record);
//    int insert(Order_line record);
//    Order_line selectByPrimaryKey(Long id);

    List<Order_line> findAll();
    Order_line findOrder_lineById(Long id);
    void insertOrUpdate(Order_line order_line)throws Exception;
    void deleteOrder_lineById(Long id) throws Exception;
    void batchDelete(long[] ids) throws Exception;
    List<Order_lineExtend> findOrderDetails(Long id);
}
