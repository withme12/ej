package com.briup.apps.ej.dao.extend;

import com.briup.apps.ej.bean.extend.OrderExtend;

import java.util.List;

public interface OrderExtendMapper {
    List<OrderExtend> findOrderAllMessageById(Long id);
}
