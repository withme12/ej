package com.briup.apps.ej.web.controller;

import com.briup.apps.ej.bean.Order;
import com.briup.apps.ej.bean.Order_line;
import com.briup.apps.ej.service.IOrder_lineService;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order_line")
public class Order_lineController {

    @Autowired
    private IOrder_lineService order_lineService;

    @GetMapping("findAll")
    public Message findAll(){
        List<Order_line> list = order_lineService.findAll();
        return MessageUtil.success("success",list);
    }

    @ApiOperation("通过id查询")
    @GetMapping("findById")
    public Message findById(
            @ApiParam(value = "主键",required = true)
            @RequestParam(value = "id") long id){
        return MessageUtil.success("success",order_lineService.findOrder_lineById(id));
    }

    @ApiOperation("通过id删除用户")
    @GetMapping("deleteById")
    public Message deleteById(long id){
        try {
            order_lineService.deleteOrder_lineById(id);
            return MessageUtil.success("删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }

    @ApiOperation("批量删除")
    @GetMapping("batchDelete")
    public Message batchDelete(long[] ids) throws Exception{
        order_lineService.batchDelete(ids);
        return MessageUtil.success("9批量删除成功");
    }

    @ApiOperation("保存或更新用户信息")
    @GetMapping("saveOrUpdate")
    public Message insertOrUpdate(Order_line order_line) {
        try {
            order_lineService.insertOrUpdate(order_line);
            return MessageUtil.success("保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error(e.getMessage());
        }
    }
}
