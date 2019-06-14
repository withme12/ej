package com.briup.apps.ej.web.controller;
import com.briup.apps.ej.bean.extend.OrderExtend;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.bean.Customer;
import com.briup.apps.ej.service.ICustomerService;
import com.briup.apps.ej.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
@Validated
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping("findAll")
    public Message findAll(){
    List<Customer> list =customerService.findAll();
    return MessageUtil.success("success",list);
}
    @GetMapping("findCustomerById")
    @ApiOperation("通过ID查询顾客信息")
    public Message findCustomerById(@ApiParam(value = "主键",required =true)@RequestParam("id") Long id){
        Customer customer=customerService.findCustomerById(id);
        return MessageUtil.success("success",customer);
    }
    @GetMapping("insertOrUpdate")
    @ApiOperation("新增或者更新顾客信息")
    public Message insertOrUpdate( Customer customer)throws Exception{
        try{
            customerService.insertOrUpdate(customer);
            return MessageUtil.success("success");
        }catch (Exception e){
            e.printStackTrace();
            return MessageUtil.error("更新失败");
        }
    }
    @GetMapping("deleteCustomerById")
    @ApiOperation("根据ID更新顾客信息")
    public Message deleteCustomerById(@ApiParam(value="主键",required=true)@RequestParam("id") Long id) throws Exception{
        try {
            customerService.deleteCustomerById(id);
            return MessageUtil.success("success");
        }catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.error("删除失败");
        }
    }
    @GetMapping("query")
    @ApiOperation("模糊查询顾客信息")
    public Message query(Customer customer){
        List<Customer> list=customerService.query(customer);
        return MessageUtil.success("success",list);
    }
    @PostMapping("batchDelete")
    @ApiOperation("批量删除顾客信息")
    public Message BatchDelete(@NotNull(message = "ids不能为空") long[] ids) throws Exception {
        try {
            customerService.batchDelete(ids);
            return MessageUtil.success("批量删除成功");
        }catch (Exception e)
        {
            e.printStackTrace();
            return MessageUtil.error("删除失败");
        }
}
    @PostMapping("findOrderAllMessageById")
    @ApiOperation("查询用户的订单的巨详细")
    public Message findOrderAllMessageById(@NotNull @RequestParam("id") Long id){
        List<OrderExtend> list =customerService.findOrderAllMessageById(id);
        return MessageUtil.success("success",list);
    }
}
