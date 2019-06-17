package com.briup.apps.ej.dao.extend;

import com.briup.apps.ej.bean.extend.Order_lineExtend;

import java.util.List;

public interface Order_lineExtendMapper {
    List<Order_lineExtend> findOrderDetails(Long id);
}
