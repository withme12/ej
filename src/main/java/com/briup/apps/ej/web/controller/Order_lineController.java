package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.Order_line;
import com.briup.apps.ej.service.IOrder;
import com.briup.apps.ej.service.IOrder_line;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order_line")
public class Order_lineController {

    @Autowired
    private IOrder_line order_line;
    @ApiOperation("模糊查询")
    @GetMapping("findById")
    public Message findById(@ApiParam(value = "主键",required = true) @RequestParam(value = "id") long id){
        return MessageUtil.success("success",order_line.selectByPrimaryKey(id));
    }

    @ApiOperation("通过id删除用户")
    @GetMapping("deleteById")
    public Message deleteById(long id){
        try {
            order_line.deleteByPrimaryKey(id);
            return MessageUtil.success("删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }

    @ApiOperation("插入")
    @GetMapping("insertSelective")
    public Message insert(Order_line record){
        return MessageUtil.success("success",order_line.insert(record));
    }
}
