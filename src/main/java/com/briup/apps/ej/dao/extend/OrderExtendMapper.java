package com.briup.apps.ej.dao.extend;

import com.briup.apps.ej.bean.extend.OrderExtend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderExtendMapper {
    List<OrderExtend> findOrderAllMessageById(Long id);
    List<OrderExtend> findWaiterOrderMessageById(Long id);
    List<OrderExtend> query2(
            @Param("customerId") Long customerId,
            @Param("waiterId") Long waiterId
    );


}
