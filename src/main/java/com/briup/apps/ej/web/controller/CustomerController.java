package com.briup.apps.ej.web.controller;
import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.bean.Customer;
import com.briup.apps.ej.service.ICustomerService;
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
    public Message insertOrUpdate(Customer customer)throws Exception{
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
    public Message deleteCustomerById(@ApiParam(value="主键",required=true)@RequestParam("id") Long id)throws Exception{
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
}